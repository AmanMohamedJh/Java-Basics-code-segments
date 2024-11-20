#include <stdio.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>

void CPU() {}    


int main() {
    pid_t pid;

    for (int i = 0; i < 3; i++) {
        if ((pid = fork()) < 0) {
          
            printf("error occurred in fork system call!\n");
            
        } else if (pid == 0) {
            
            CPU();
            return 0;
        }
        printf("Parent Process ID: %d, Child Process ID (pid): %d\n", pid);
    }

    
    for (int i = 0; i < 3; i++) {
        wait(NULL); 
    }

    return 0;
}