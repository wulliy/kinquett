alloc 2 1
set 1 1
print $1
set 1 (math #$1,$1,:+)
print $1
goto 3
