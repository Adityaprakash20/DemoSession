class LearingDiffReturnAndExit{

public static void main(String[] args){


displayIntegers();

System.out.println("I am back in Main Method");


}

public static void displayIntegers()

{
for(int i=0;i<=4;i++){

System.out.println(i);
if(i==3)
{

return;
//System.exit(0);

}

}



}


}