/*
Bits: 
- computer store information using electricity, which has two states (on, off)
- represented by a light bulb
- 0 is off, 1 is on
- base 2 system:
- if each bit can hold a one or a zero, and you have 2 bits, then you can represent 4 numbers
- 2 bits: 2 ^ (2) = 4
- 3 bits: 2 ^ (3) = 8

Binary: means base two, uses digits 0 and 1
- 1 represents ON state
- 0 represents OFF state

| 2^7 | 2^6 | 2^5 | 2^4 | 2^3 | 2^2 | 2^1 | 2^0 |
|-----|-----|-----|-----|-----|-----|-----|-----|
| 128 | 64  | 32  | 16  | 8   | 4   | 2   | 1   |

Changing binary number to base ten:
0001 0110
| 2^7 | 2^6 | 2^5 | 2^4 | 2^3 | 2^2 | 2^1 | 2^0 |
|-----|-----|-----|-----|-----|-----|-----|-----|
| 128 | 64  | 32  | 16  | 8   | 4   | 2   | 1   |
| 0   | 0   | 0   | 1   | 0   | 1   | 1   | 0   |

2^4 + 2^2 + 2^1 = 22

Change base ten to binary number:
1) Find largest power of two which is smaller than the base ten number
2) Subtract and repeat

Base ten: 71
71 - 64 = 7 -> 2^6
7 - 4 = 3 0> 2^2
3 - 2 = 1 -> 2^1
1 = 2^0

Octal: works in same pattern as binary, but base 8
- however, it's not just 1 and 0. It can be from 0-7.
| 8^2  | 8^3 | 8^2 | 8^1 | 8^0 |
|------|-----|-----|-----|-----|
| 4096 | 512 | 64  | 8   | 1   |


*/