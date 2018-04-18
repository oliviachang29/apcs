/*
Primitive Types as Parameters:
- method copies the value and stores it in the local parameter
- any changes are made when control returns to the calling function
- local parameter is garbage collected

Class Types as Parameters:
- method copies the *reference* to the memory address and stores it in the local parameter
- since the reference points to the original spot in memory, all changes are saved
*/