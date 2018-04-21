/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */

/**
 * Contains bindings to the <a target="_blank" href="http://www.dyncall.org/">dyncall</a> library.
 * 
 * <p>The dyncall library encapsulates architecture-, OS- and compiler-specific function call semantics in a virtual bind argument parameters from left to
 * right and then call interface allowing programmers to call C functions in a completely dynamic manner. In other words, instead of calling a function
 * directly, the dyncall library provides a mechanism to push the function parameters manually and to issue the call afterwards.</p>
 * 
 * <p>This means, that a program can determine at runtime what function to call, and what parameters to pass to it. The library is written in C and assembly
 * and provides a very simple C interface to program against.</p>
 * 
 * <p>The library comes in very handy to power flexible message systems, dynamic function call dispatch mechanisms, closure implementations, to bridge
 * different programming languages, or to simply wrap a "vararg" function.</p>
 * 
 * <p>When it comes to language bindings, the dyncall library provides a clean and portable C interface to dynamically issue calls to foreign code using
 * small call kernels written in assembly. Instead of providing code for every bridged function call, which unnecessarily results in code bloat, only a
 * couple of instructions are used to invoke every possible call.</p>
 */
@org.lwjgl.system.NonnullDefault
package org.lwjgl.system.dyncall;

