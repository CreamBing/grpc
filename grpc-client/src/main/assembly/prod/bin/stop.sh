#!/bin/bash
cd `dirname $0`
BIN_DIR=`pwd`
cd ..
DEPLOY_DIR=`pwd`
SERVER_NAME=grpcclient

if [ -z "$SERVER_NAME" ]; then
    echo "SERVER_NAME is empty, nothing to do."
    exit 1
    #SERVER_NAME=`hostname`
fi

if [ "$1" = "-a" ]
then
    PIDS=`ps -ef | grep java | grep "$SERVER_NAME" |awk '{print $2}'`
else
    PIDS=`cat $DEPLOY_DIR/pid`
fi

if [ -z "$PIDS" ]; then
    echo "ERROR: The $SERVER_NAME does not started!"
    exit 1
fi

echo -e "Stopping the $SERVER_NAME ...\c"
for PID in $PIDS ; do
    kill $PID > /dev/null 2>&1
done

COUNT=0
while [ $COUNT -lt 1 ]; do    
    echo -e ".\c"
    sleep 1
    COUNT=1
    for PID in $PIDS ; do
        PID_EXIST=`ps -f -p $PID | grep java`
        if [ -n "$PID_EXIST" ]; then
            COUNT=0
            break
        fi
    done
done

echo "OK!"
echo "PID: $PIDS"
