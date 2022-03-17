#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
  char *buffer = NULL;
  int read;
  unsigned int len;
  char first_char;
  int line_count = 0;

  read = getline(&buffer, &len, stdin);
  if (-1 == read)
    printf("No line read...\n");
  while (len <= 3) {
    line_count++;
    printf(buffer);
    len = getline(&buffer, &len, stdin);
  }
  free(buffer);
  return 0;
}