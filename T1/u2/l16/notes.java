// DeMorgan's Law
// "distribute" a ! across ()
// && -> ||
// < -> >=  
// > -> <=

// ex:
!( a || b) // becomes
!a && !b // be careful to also distribute to the middle symbol

// ex: 
!( (x==1) && (y==1) ) // becomes
x!=1 || y!=1 

// ex: 
!(grade > 90) // becomes
grade <= 90