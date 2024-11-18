/* SPDX-License-Identifier: MIT */
#ifndef LIBURING_SANITIZE_H
#define LIBURING_SANITIZE_H

#ifdef __cplusplus
extern "C" {
#endif

struct io_uring;
struct iovec;

#if defined(CONFIG_USE_SANITIZER)
void liburing_sanitize_ring(struct io_uring *ring);
void liburing_sanitize_address(const void *addr);
void liburing_sanitize_region(const void *addr, unsigned int len);
void liburing_sanitize_iovecs(const struct iovec *iovecs, unsigned nr);
#else
#define __maybe_unused	__attribute__((__unused__))
static inline void liburing_sanitize_ring(struct io_uring __maybe_unused *ring)
{
}
static inline void liburing_sanitize_address(const void __maybe_unused *addr)
{
}
static inline void liburing_sanitize_region(const void __maybe_unused *addr,
					    unsigned int __maybe_unused len)
{
}
static inline void liburing_sanitize_iovecs(const struct iovec __maybe_unused *iovecs,
					    unsigned __maybe_unused nr)
{
}
#endif

#ifdef __cplusplus
}
#endif

#endif
