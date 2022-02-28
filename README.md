install Mysql
link: https://www.mysqltutorial.org/install-mysql/

open Mysql client terminal:

create database drivers_app; 

create user 'springuser'@'%' identified by 'ThePassword'; 

grant all on drivers_app.* to 'springuser'@'%';

// הקמנו גם טבלה? או שזה יצר אוטומטית?

If you use Gradle, you can run the application by using ./gradlew bootRun

curl 'http://localhost:8080/drivers/all'

curl http://localhost:8080/drivers/add -d name=dorka -d age=25 -d address=holon -d status=INACTIVE -d startWorkingHour=12 -d endWorkingHour=17 -d latitude=12.552 -d long
itude=35.55 -X POST

// לא ביצענו בדיקה לנתונים שנכנסים

curl 'http://localhost:8080/drivers/5' -X DELETE

curl 'http://localhost:8080/drivers/active'

curl http://localhost:8080/drivers/timeWindow -d fromHour=10 -d toHour=17