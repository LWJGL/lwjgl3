#include <stddef.h>

void *old_memcpy(void *, const void *, size_t);

__asm__(".symver old_memcpy,memcpy@GLIBC_2.2.5");

void *__wrap_memcpy(void *dest, const void *src, size_t n) {
	return old_memcpy(dest, src, n);
}
