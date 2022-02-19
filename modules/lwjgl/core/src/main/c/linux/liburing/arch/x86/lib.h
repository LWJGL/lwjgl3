/* SPDX-License-Identifier: MIT */

#ifndef __INTERNAL__LIBURING_LIB_H
	#error "This file should be included from src/lib.h (liburing)"
#endif

#ifndef LIBURING_ARCH_X86_LIB_H
#define LIBURING_ARCH_X86_LIB_H

#if defined(__x86_64__)

static inline long get_page_size(void)
{
	return 4096;
}

#else /* #if defined(__x86_64__) */

/*
 * For x86 (32-bit), fallback to libc wrapper.
 * We can't use CONFIG_NOLIBC for x86 (32-bit) at the moment.
 *
 * TODO: Add x86 (32-bit) nolibc support.
 */
#ifdef CONFIG_NOLIBC
	#error "x86 (32-bit) is currently not supported for nolibc builds"
#endif
#include "../generic/lib.h"

#endif /* #if defined(__x86_64__) */

#endif /* #ifndef LIBURING_ARCH_X86_LIB_H */
