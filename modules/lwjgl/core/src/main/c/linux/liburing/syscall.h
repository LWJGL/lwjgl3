/* SPDX-License-Identifier: MIT */
#ifndef LIBURING_SYSCALL_H
#define LIBURING_SYSCALL_H

#include <errno.h>
#include <signal.h>
#include <stdint.h>
#include <unistd.h>
#include <stdbool.h>
#include <sys/mman.h>
#include <sys/syscall.h>
#include <sys/resource.h>

#include <liburing.h>

#ifdef __alpha__
/*
 * alpha and mips are exception, other architectures have
 * common numbers for new system calls.
 */
# ifndef __NR_io_uring_setup
#  define __NR_io_uring_setup		535
# endif
# ifndef __NR_io_uring_enter
#  define __NR_io_uring_enter		536
# endif
# ifndef __NR_io_uring_register
#  define __NR_io_uring_register	537
# endif
#elif defined __mips__
# ifndef __NR_io_uring_setup
#  define __NR_io_uring_setup		(__NR_Linux + 425)
# endif
# ifndef __NR_io_uring_enter
#  define __NR_io_uring_enter		(__NR_Linux + 426)
# endif
# ifndef __NR_io_uring_register
#  define __NR_io_uring_register	(__NR_Linux + 427)
# endif
#else /* !__alpha__ and !__mips__ */
# ifndef __NR_io_uring_setup
#  define __NR_io_uring_setup		425
# endif
# ifndef __NR_io_uring_enter
#  define __NR_io_uring_enter		426
# endif
# ifndef __NR_io_uring_register
#  define __NR_io_uring_register	427
# endif
#endif

/*
 * Don't put this below the #include "arch/$arch/syscall.h", that
 * file may need it.
 */
struct io_uring_params;

static inline void *ERR_PTR(intptr_t n)
{
	return (void *) n;
}

static inline intptr_t PTR_ERR(const void *ptr)
{
	return (intptr_t) ptr;
}

static inline bool IS_ERR(const void *ptr)
{
	return uring_unlikely((uintptr_t) ptr >= (uintptr_t) -4095UL);
}

#define __INTERNAL__LIBURING_SYSCALL_H
#if defined(__x86_64__) || defined(__i386__)
	#include "arch/x86/syscall.h"
#else
	/*
	 * We don't have native syscall wrappers
	 * for this arch. Must use libc!
	 */
	#ifdef CONFIG_NOLIBC
		#error "This arch doesn't support building liburing without libc"
	#endif
	/* libc syscall wrappers. */
	#include "arch/generic/syscall.h"
#endif
#undef __INTERNAL__LIBURING_SYSCALL_H

/*
 * For backward compatibility.
 * (these __sys* functions always use libc, see syscall.c)
 */
int __sys_io_uring_setup(unsigned entries, struct io_uring_params *p);
int __sys_io_uring_enter(int fd, unsigned to_submit, unsigned min_complete,
			 unsigned flags, sigset_t *sig);
int __sys_io_uring_enter2(int fd, unsigned to_submit, unsigned min_complete,
			  unsigned flags, sigset_t *sig, int sz);
int __sys_io_uring_register(int fd, unsigned int opcode, const void *arg,
			    unsigned int nr_args);

#endif
