# ShiftRightCheckingMinus
Calculating >> for negotive integer numbers

        // it is a  rule, that a>>n = a/(Math.pow(2,n))    (if a>0)

        // but my theory is, that if a< 0 and a % (Math.pow(2,n)) !=0,
        // than a>>n = a/(Math.pow(2,n)) - 1, else a>>n = a/(Math.pow(2,n))

        // Confirming for all integer numbers, that my theory is right
