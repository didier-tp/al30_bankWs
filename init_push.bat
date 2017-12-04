cd /d "%~dp0"
git init
git add *
git commit -a -m "version initiale"
git remote add gitHubOrigin_al30_bankWs https://didier-tp:pwd007!@github.com/didier-tp/al30_bankWs.git
git push -u gitHubOrigin_al30_bankWs master
pause

REM open with text editor
REM opne with system editor