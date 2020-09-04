

#include <stdio.h>

int main()
{
    long d;
    printf("Number:",d);
    scanf("%ld",&d);
    int temp=d;
    int s=0;
    while(temp>0||s>9){
        if(temp==0){
            temp=s;
            s=0;
        }
        s+=temp%10;
        temp/=10;
    }
    printf("%d",s);

    return 0;
}

