nohup java -jar /app.jar &
while true
do  
   curl -s -k http://localhost:8080/throwException > /dev/null 2>/dev/null
   sleep 3
done