function pow(x0) {
	return x0 * x0
}

function sub(x1) {
	return x1 - 5
}

function f(x2) {
	var r1 = pow(x2)
	var r2 = sub(r1)
	return r2

	// return sub(pow(x2))
	// return pow(x2)
	// return x2

}

var x = 10
var y = f(x)

// CreateFunctionContext <scope_info_idx> <slots> : Creates a new context with number of |slots| for the function closure.
// PushContext <context> : Saves the current context in <context>, and pushes the accumulator as the new current context.
// CreateClosure <index> <slot> <flags> : Creates a new closure for SharedFunctionInfo at position |index| in the
// constant pool and with pretenuring controlled by |flags|.
// StaCurrentContextSlot <slot_index> : Stores the object in the accumulator into |slot_index| of the current context.


// Call <callable> <receiver> <arg_count> <feedback_slot_id>
//
// Call a JSfunction or Callable in |callable| with the |receiver| and
// |arg_count| arguments in subsequent registers. Collect type feedback
// into |feedback_slot_id|



// CreateFunctionContext [0], [2]		// acc = context (контекст на 2 "ячейки")
// PushContext r3						// текущий контекст сохраняется в r3, <context> = acc = context


CreateClosure [1], [0], #2			// acc = closure_1
StaCurrentContextSlot [2]			// <context[2]> = acc (closure_1)
CreateClosure [2], [1], #2			// acc = closure_2
StaCurrentContextSlot [3]			// <context[3]> = acc (closure_2)
CreateClosure [3], [2], #2			// acc = closure_3
Star r0								// r0 = closure_3
LdaSmi [10]							// acc = 10
Star r1								// r1 = acc = 10
CallUndefinedReceiver1 r0, r1, [0]	// call( r0=closure_3, r1 = 10, [0] ) -> acc = 95
Star r2								// r2 = acc


LdaUndefined 						// acc = undefined
Return 								// acc -> undefined



////////
// LdaImmutableCurrentContextSlot <slot_index> : Load the object in |slot_index| of the current context into the accumulator.
"function f"
LdaImmutableCurrentContextSlot [2] 	// acc = <context[2]> (closure_1)
Star r2								// r2 = acc = closure_1
CallUndefinedReceiver1 r2, a0, [0]	// call ( r2=closure_1, a0=r1=10, [0] ) -> acc = 100
Star r0								// r0 = acc = 100
LdaImmutableCurrentContextSlot [3]	// acc = <context[3]> (closure_2)
Star r2								// r2 = acc = closure_2
CallUndefinedReceiver1 r2, r0, [2]	// call ( r2=closure_2, r0= ) -> acc = 95
Star r1								// r1 = 95
Return 								// acc -> 95

"function pow"
Ldar a0
Mul a0, [0]
Return // acc -> 100

"function sub"
Ldar a0
SubSmi [5], [0]
Return // acc -> 95

