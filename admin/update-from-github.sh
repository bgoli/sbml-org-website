#!/bin/bash
## ============================================================================
## File name   : update-from-github.sh
## Description : Script to update local files to match a given remote git branch
## Author(s)   : Michael Hucka <mhucka@caltech.edu>
## Organization: California Institute of Technology
## Date created: 2019-03-19
#
# This checks a remote git repostiory for changes to a git repository, and if it
# detects that the remote is ahead of the local copy, it does a git rebase to
# synchronize the local copy with the remote.  The script takes an optional
# argument: the branch to compare against.  (The default is master.)
#
# To make it possible to clone the github repo, the repo must be public and
# the protocol used to create the initial git clone must be https instead of
# git (or else you will get permission denied errors when this script runs).
#
# Don't forget to clone with --recursive!
#
# This is intended to be run from cron or a similar system daemon control
# system (e.g., Jenkins).  Here's an example of a cron entry:
#
#    */5 * * * * /var/www/sites/sbml/admin/update-from-github.sh >> /var/log/hugo/github-updates.log 2>&1
#
# Assumptions:
# - the remote origin is set in the git repo (=> don't need an argument)
# - this script is in the /admin subdirectory and hasn't been copied somewhere
# - permissions are set up properly so can clone repo
# -----------------------------------------------------------------------------

# Because this is run from cron, we may need to include /usr/local/bin/.

PATH=/usr/local/bin:/opt/local/bin:/bin:/usr/bin

# Get the path of our local repo based on where this file is found.

REPO="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"

# Get info about the remote origin.  The echo to /dev/null is because "git
# remote update" doesn't accept a --quiet argument.

echo "===== ${0##*/} started at $(/bin/date '+%G-%m-%d:%H%M') ====="

cd $REPO
git remote update > /dev/null

# The following code is based on http://stackoverflow.com/a/3278427/743730

UPSTREAM=${1:-'@{u}'}
LOCAL=$(git rev-parse @{0})
REMOTE=$(git rev-parse "$UPSTREAM")
BASE=$(git merge-base @{0} "$UPSTREAM")

RETVAL=0
if [ $LOCAL = $REMOTE ]; then
    echo "Up-to-date"
elif [ $LOCAL = $BASE ]; then
    # echo "Need to pull"
    git stash
    git pull --rebase origin master
    RETVAL=$?
elif [ $REMOTE = $BASE ]; then
    echo "Need to push"
else
    echo "Diverged"
fi

echo "===== ${0##*/} stopped at $(/bin/date '+%G-%m-%d:%H%M') ====="
exit $RETVAL