/* SPDX-License-Identifier: MIT */
#ifndef LIBURING_LIB_H
#define LIBURING_LIB_H

#include <stdlib.h>
#include <string.h>
#include <unistd.h>

#ifdef CONFIG_NOLIBC
#  if defined(__x86_64__) || defined(__i386__)
#    include "arch/x86/lib.h"
#  else
#    error "This arch doesn't support building liburing without libc"
#  endif
#endif

#ifndef offsetof
# define offsetof(TYPE, FIELD) ((size_t) &((TYPE *)0)->FIELD)
#endif

#ifndef container_of
# define container_of(PTR, TYPE, FIELD) ({				\
	__typeof__(((TYPE *)0)->FIELD) *__FIELD_PTR = (PTR);		\
	(TYPE *)((char *) __FIELD_PTR - offsetof(TYPE, FIELD));		\
})
#endif


static inline long get_page_size(void)
{
#ifdef CONFIG_NOLIBC
	return __arch_impl_get_page_size();
#else
	long page_size;

	page_size = sysconf(_SC_PAGESIZE);
	if (page_size < 0)
		page_size = 4096;

	return page_size;
#endif
}

#endif /* #ifndef LIBURING_LIB_H */
