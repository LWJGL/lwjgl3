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


#ifdef CONFIG_NOLIBC
#  if defined(__x86_64__) || defined(__i386__)
#    include "arch/x86/syscall.h"
#  else
#    error "This arch doesn't support building liburing without libc"
#  endif
#endif


/*
 * System calls
 */
int __sys_io_uring_setup(unsigned entries, struct io_uring_params *p);
int __sys_io_uring_enter(int fd, unsigned to_submit, unsigned min_complete,
			 unsigned flags, sigset_t *sig);
int __sys_io_uring_enter2(int fd, unsigned to_submit, unsigned min_complete,
			  unsigned flags, sigset_t *sig, int sz);
int __sys_io_uring_register(int fd, unsigned int opcode, const void *arg,
			    unsigned int nr_args);

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

static inline int ____sys_io_uring_register(int fd, unsigned opcode,
					    const void *arg, unsigned nr_args)
{
#ifdef CONFIG_NOLIBC
	return __arch_impl_io_uring_register(fd, opcode, arg, nr_args);
#else
	int ret;
	ret = syscall(__NR_io_uring_register, fd, opcode, arg, nr_args);
	return (ret < 0) ? -errno : ret;
#endif
}

static inline int ____sys_io_uring_setup(unsigned entries,
					 struct io_uring_params *p)
{
#ifdef CONFIG_NOLIBC
	return __arch_impl_io_uring_setup(entries, p);
#else
	int ret;
	ret = syscall(__NR_io_uring_setup, entries, p);
	return (ret < 0) ? -errno : ret;
#endif
}

static inline int ____sys_io_uring_enter2(int fd, unsigned to_submit,
					  unsigned min_complete, unsigned flags,
					  sigset_t *sig, int sz)
{
#ifdef CONFIG_NOLIBC
	return __arch_impl_io_uring_enter(fd, to_submit, min_complete, flags,
					  sig, sz);
#else
	int ret;
	ret = syscall(__NR_io_uring_enter, fd, to_submit, min_complete, flags,
		      sig, sz);
	return (ret < 0) ? -errno : ret;
#endif
}

static inline int ____sys_io_uring_enter(int fd, unsigned to_submit,
					 unsigned min_complete, unsigned flags,
					 sigset_t *sig)
{
	return ____sys_io_uring_enter2(fd, to_submit, min_complete, flags, sig,
				       _NSIG / 8);
}

static inline void *uring_mmap(void *addr, size_t length, int prot, int flags,
			       int fd, off_t offset)
{
#ifdef CONFIG_NOLIBC
	return __arch_impl_mmap(addr, length, prot, flags, fd, offset);
#else
	void *ret;
	ret = mmap(addr, length, prot, flags, fd, offset);
	return (ret == MAP_FAILED) ? ERR_PTR(-errno) : ret;
#endif
}

static inline int uring_munmap(void *addr, size_t length)
{
#ifdef CONFIG_NOLIBC
	return __arch_impl_munmap(addr, length);
#else
	int ret;
	ret = munmap(addr, length);
	return (ret < 0) ? -errno : ret;
#endif
}

static inline int uring_madvise(void *addr, size_t length, int advice)
{
#ifdef CONFIG_NOLIBC
	return __arch_impl_madvise(addr, length, advice);
#else
	int ret;
	ret = madvise(addr, length, advice);
	return (ret < 0) ? -errno : ret;
#endif
}

static inline int uring_getrlimit(int resource, struct rlimit *rlim)
{
#ifdef CONFIG_NOLIBC
	return __arch_impl_getrlimit(resource, rlim);
#else
	int ret;
	ret = getrlimit(resource, rlim);
	return (ret < 0) ? -errno : ret;
#endif
}

static inline int uring_setrlimit(int resource, const struct rlimit *rlim)
{
#ifdef CONFIG_NOLIBC
	return __arch_impl_setrlimit(resource, rlim);
#else
	int ret;
	ret = setrlimit(resource, rlim);
	return (ret < 0) ? -errno : ret;
#endif
}

static inline int uring_close(int fd)
{
#ifdef CONFIG_NOLIBC
	return __arch_impl_close(fd);
#else
	int ret;
	ret = close(fd);
	return (ret < 0) ? -errno : ret;
#endif
}

#endif
