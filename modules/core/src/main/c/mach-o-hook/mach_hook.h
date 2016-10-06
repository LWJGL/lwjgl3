#pragma once

#include <stdint.h>

typedef uint64_t mach_substitution;  //64-bit value to store relocation data, can be just a function address

#ifdef __cplusplus
extern "C"
{
#endif
/*
 * mach_hook_init(library_filename, library_address)
 * Prepares library for hooking by reading and parsing all necessary info from a target Mach-O file.
 * Returns an opaque handle to refer this library for future redirection.
 * library_filename: a path to the library in filesystem
 * library_address: an address of the loaded library image in memory
 */
void *mach_hook_init(char const *library_filename, void const *library_address);

/*
 * mach_hook(handle, function_name, substitution)
 * Redirects a particular function call in a particular library to another address.
 * Returns some opaque data, which can be used for future restoration with this function.
 * handle: an opaque handle of the library returned by mach_hook_init()
 * function_name: a name of the function being hooked
 * substitution: 64-bit data, which can contatin a function's address (for the first time) or a return value of previous redirection
 */
mach_substitution mach_hook(void const *handle, char const *function_name, mach_substitution substitution);

/*
 * mach_hook_free(handle)
 * Releases a library handle, returned by mach_hook_init()
 */
void mach_hook_free(void *handle);

#ifdef __cplusplus
}
#endif
