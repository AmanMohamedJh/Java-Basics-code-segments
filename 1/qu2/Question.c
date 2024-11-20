#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h> // For wait()

void function_A()
{
    // Define what function_A does here
    printf("In child process: %d\n", getpid());
}

int main()
{
    pid_t pid;

    for(int i = 0; i < 10; i++)
    {
        if ((pid = fork()) < 0)
        {

        }
        else if (pid == 0)
        {
            function_A();
            return 0;
        }
        else if(pid>0){
        printf("Parent Process: PID = %d, fork() returned = %d\n", getpid(), pid);

        }
        printf("Process ID: %d \n", pid); // Line A

    }
