/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int d,k;
    printf("Enter d and k\n");
    scanf("%d\n%d",&d,&k);
    printf("Before Swapping\nd=%d\nk=%d\n",d,k);
    d=d+k;
    k=d-k;
    d=d-k;
    printf("After Swapping without a third variables\nd=%d\nk=%d",d,k);

    return 0;
}

