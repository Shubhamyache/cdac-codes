public class Search{
	public int SearchKey(int[] arr, int key){
		int last;
		for(int i =0;i<arr.length;i++){
			if(arr[i]==key){
				last = i
			}
			
		}1. Write a utility to accept any number from user and print it's table.
1. shell1.sh
-------------
echo "Enter the no"
read no
i=1
while [ $i -le 10 ]
do
   m=$((i*no))
   i=$((i+1))
   echo $m
done

2. Write a utility to print numbers 15 to 20 using for loop.
2. shell2.sh
-------------
for i in range 15 16 17 18 19 20
do
   echo $i
done

3. Write a utility to print numbers from 1 to 5 using until loop.
3. shell3.sh
-------------
i=6
no=1
until [ $i -lt 6 ]
do
  echo $no
  i=$((i+1))
  no=$((no+1))
done


4. Write a utility to print first 10 odd numbers using until loop.
4. shell4.sh
-------------
cnt=0
no=1

until [ $cnt -eq 11 ]
do
   echo $no
   no=$((no+2))
   cnt=$((cnt+1))
done


5. Accept the number from user and if the number is positive find the factorial. Give proper message.
    Write a shell utility for above problem.
5. shell5.sh
----------------
echo "Enter No ::"
read $no
if [ $no -gt 0 ]
then
  x=1
  i=1
  while [ $i -le $no ]
  do 
     x=$((x*i))
     i=$((i+1))
  done
  echo $x
else
  echo "Negative number"
fi

6. Write a utility to accept 2 numbers, m and n  from user. Utility should print all even nos starting from
    m till n. Also it should print the count of numbers.
    e.g m=5 n=15
    0/p : 6 8 10 12  14
    count : 5
6. shell6.sh
--------------
echo enter the number
read m
echo enter the number
read n
cnt=0
while [ $m -le $n ]
do
  p=$((m%2))
  if [ p -eq 0 ]
  then
    echo $m
    cnt=$((cnt+1))
  fi
  m=$((m+1))
done
echo $cnt


7. Write a utility to accept number from user and check if it is prime.
7. shell7.sh
-------------
echo "Enter the no"
read no
i=2
b=$((no-1))
flag=1
while [ $i -le $b ]
do
   p=$((no%i))
   if [ $p == 0 ]
   then
     flag=0
     break
   fi
done
if [ $flag -eq 0 ]
then
   echo Not a prime number
else 
   echo No is a prime
fi
   
8. Write a utility to delete all empty files from your directory.
8. shell8.sh
-------------
for var in $(find . - empty)
do
    rm $var;
done

9. Write a utility to move all the files of size more than 0 bytes to another directory. Make sure that 
    directory is already existing.
9. shell9.sh
--------------
for var in $(find . -type f -size +0c)
   do
     mv $var newdir/.
   done

10. Accept a number n from the user. Write a utility to print n odd numbers and print
10. shell10.sh
---------------
echo "Enter the number"
read n
i=0
no=1
while [ $i -lt $n ]
do
 echo $no
 no=$((no+1))
 i=$((i+1))
done

11. Display contents of all the files in your curren.t directory. Script should
    display the name of file and then it's contents. If it is directory, proper
    message should be displayed.
11. shell11.sh
--------------
for var in $(ls)
do
  if [ -f $var ]
  then
     echo $var
     cat $var
  fi
  if [ -d $var ]
  then
     echo $var is a dierctory
  fi  
done