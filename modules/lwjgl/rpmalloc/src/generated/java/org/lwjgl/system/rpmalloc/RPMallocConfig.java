/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * This struct enables configuration of a memory mapper providing map/unmap of memory pages. Defaults to {@code VirtualAlloc}/{@code mmap} if none
 * provided. This allows rpmalloc to be used in contexts where memory is provided by internal means.
 * 
 * <p>Page size may be set explicitly in initialization. This allows the allocator to be used as a sub-allocator where the page granularity should be lower
 * to reduce risk of wasting unused memory ranges.</p>
 * 
 * <p>If rpmalloc is built with {@code ENABLE_GUARDS}, {@code memory_overwrite} may be set to detect writes before or after allocated memory blocks. This is
 * not enabled in the default LWJGL build.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct rpmalloc_config_t {
 *     void * (*{@link RPMemoryMapCallbackI memory_map}) (size_t size, size_t *offset);
 *     void (*{@link RPMemoryUnmapCallbackI memory_unmap}) (void *address, size_t size, size_t offset, int release);
 *     void (*{@link RPErrorCallbackI error_callback}) (char const *message);
 *     int (*{@link RPMapFailCallbackI map_fail_callback}) (size_t size);
 *     size_t {@link #page_size};
 *     size_t {@link #span_size};
 *     size_t {@link #span_map_count};
 *     int {@link #enable_huge_pages};
 *     char[4];
 * }</code></pre>
 */
@NativeType("struct rpmalloc_config_t")
public class RPMallocConfig extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MEMORY_MAP,
        MEMORY_UNMAP,
        ERROR_CALLBACK,
        MAP_FAIL_CALLBACK,
        PAGE_SIZE,
        SPAN_SIZE,
        SPAN_MAP_COUNT,
        ENABLE_HUGE_PAGES;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __padding(4, true)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MEMORY_MAP = layout.offsetof(0);
        MEMORY_UNMAP = layout.offsetof(1);
        ERROR_CALLBACK = layout.offsetof(2);
        MAP_FAIL_CALLBACK = layout.offsetof(3);
        PAGE_SIZE = layout.offsetof(4);
        SPAN_SIZE = layout.offsetof(5);
        SPAN_MAP_COUNT = layout.offsetof(6);
        ENABLE_HUGE_PAGES = layout.offsetof(7);
    }

    /**
     * Creates a {@code RPMallocConfig} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RPMallocConfig(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the memory map callback function */
    @Nullable
    @NativeType("void * (*) (size_t, size_t *)")
    public RPMemoryMapCallback memory_map() { return nmemory_map(address()); }
    /** the memory unmap callback function */
    @Nullable
    @NativeType("void (*) (void *, size_t, size_t, int)")
    public RPMemoryUnmapCallback memory_unmap() { return nmemory_unmap(address()); }
    /** the error callback function */
    @Nullable
    @NativeType("void (*) (char const *)")
    public RPErrorCallback error_callback() { return nerror_callback(address()); }
    /** the map fail callback function */
    @Nullable
    @NativeType("int (*) (size_t)")
    public RPMapFailCallback map_fail_callback() { return nmap_fail_callback(address()); }
    /**
     * the size of memory pages.
     * 
     * <p>The page size MUST be a power of two in {@code [512,16384]} range (2<sup>9</sup> to 2<sup>14</sup>) unless 0 - set to 0 to use system page size. All
     * memory mapping requests to {@code memory_map} will be made with size set to a multiple of the page size.</p>
     * 
     * <p>Used if {@code RPMALLOC_CONFIGURABLE} is defined to 1, otherwise system page size is used.</p>
     */
    @NativeType("size_t")
    public long page_size() { return npage_size(address()); }
    /**
     * size of a span of memory blocks.
     * 
     * <p>MUST be a power of two, and in {@code [4096,262144]} range (unless 0 - set to 0 to use the default span size).</p>
     * 
     * <p>Used if {@code RPMALLOC_CONFIGURABLE} is defined to 1.</p>
     */
    @NativeType("size_t")
    public long span_size() { return nspan_size(address()); }
    /**
     * number of spans to map at each request to map new virtual memory blocks.
     * 
     * <p>This can be used to minimize the system call overhead at the cost of virtual memory address space. The extra mapped pages will not be written until
     * actually used, so physical committed memory should not be affected in the default implementation.</p>
     * 
     * <p>Will be aligned to a multiple of spans that match memory page size in case of huge pages.</p>
     */
    @NativeType("size_t")
    public long span_map_count() { return nspan_map_count(address()); }
    /**
     * enable use of large/huge pages.
     * 
     * <p>If this flag is set to non-zero and page size is zero, the allocator will try to enable huge pages and auto detect the configuration. If this is set to
     * non-zero and page_size is also non-zero, the allocator will assume huge pages have been configured and enabled prior to initializing the allocator.</p>
     * 
     * <p>For Windows, see <a href="https://docs.microsoft.com/en-us/windows/desktop/memory/large-page-support">large-page-support</a>. For Linux, see
     * <a href="https://www.kernel.org/doc/Documentation/vm/hugetlbpage.txt">hugetlbpage.txt</a>.</p>
     */
    @NativeType("int")
    public boolean enable_huge_pages() { return nenable_huge_pages(address()) != 0; }

    /** Sets the specified value to the {@link #memory_map} field. */
    public RPMallocConfig memory_map(@Nullable @NativeType("void * (*) (size_t, size_t *)") RPMemoryMapCallbackI value) { nmemory_map(address(), value); return this; }
    /** Sets the specified value to the {@link #memory_unmap} field. */
    public RPMallocConfig memory_unmap(@Nullable @NativeType("void (*) (void *, size_t, size_t, int)") RPMemoryUnmapCallbackI value) { nmemory_unmap(address(), value); return this; }
    /** Sets the specified value to the {@link #error_callback} field. */
    public RPMallocConfig error_callback(@Nullable @NativeType("void (*) (char const *)") RPErrorCallbackI value) { nerror_callback(address(), value); return this; }
    /** Sets the specified value to the {@link #map_fail_callback} field. */
    public RPMallocConfig map_fail_callback(@Nullable @NativeType("int (*) (size_t)") RPMapFailCallbackI value) { nmap_fail_callback(address(), value); return this; }
    /** Sets the specified value to the {@link #page_size} field. */
    public RPMallocConfig page_size(@NativeType("size_t") long value) { npage_size(address(), value); return this; }
    /** Sets the specified value to the {@link #span_size} field. */
    public RPMallocConfig span_size(@NativeType("size_t") long value) { nspan_size(address(), value); return this; }
    /** Sets the specified value to the {@link #span_map_count} field. */
    public RPMallocConfig span_map_count(@NativeType("size_t") long value) { nspan_map_count(address(), value); return this; }
    /** Sets the specified value to the {@link #enable_huge_pages} field. */
    public RPMallocConfig enable_huge_pages(@NativeType("int") boolean value) { nenable_huge_pages(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public RPMallocConfig set(
        RPMemoryMapCallbackI memory_map,
        RPMemoryUnmapCallbackI memory_unmap,
        RPErrorCallbackI error_callback,
        RPMapFailCallbackI map_fail_callback,
        long page_size,
        long span_size,
        long span_map_count,
        boolean enable_huge_pages
    ) {
        memory_map(memory_map);
        memory_unmap(memory_unmap);
        error_callback(error_callback);
        map_fail_callback(map_fail_callback);
        page_size(page_size);
        span_size(span_size);
        span_map_count(span_map_count);
        enable_huge_pages(enable_huge_pages);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public RPMallocConfig set(RPMallocConfig src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code RPMallocConfig} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RPMallocConfig malloc() {
        return wrap(RPMallocConfig.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code RPMallocConfig} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RPMallocConfig calloc() {
        return wrap(RPMallocConfig.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code RPMallocConfig} instance allocated with {@link BufferUtils}. */
    public static RPMallocConfig create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(RPMallocConfig.class, memAddress(container), container);
    }

    /** Returns a new {@code RPMallocConfig} instance for the specified memory address. */
    public static RPMallocConfig create(long address) {
        return wrap(RPMallocConfig.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RPMallocConfig createSafe(long address) {
        return address == NULL ? null : wrap(RPMallocConfig.class, address);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static RPMallocConfig mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static RPMallocConfig callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static RPMallocConfig mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static RPMallocConfig callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */

    /**
     * Returns a new {@code RPMallocConfig} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RPMallocConfig malloc(MemoryStack stack) {
        return wrap(RPMallocConfig.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code RPMallocConfig} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RPMallocConfig calloc(MemoryStack stack) {
        return wrap(RPMallocConfig.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    // -----------------------------------

    /** Unsafe version of {@link #memory_map}. */
    @Nullable public static RPMemoryMapCallback nmemory_map(long struct) { return RPMemoryMapCallback.createSafe(memGetAddress(struct + RPMallocConfig.MEMORY_MAP)); }
    /** Unsafe version of {@link #memory_unmap}. */
    @Nullable public static RPMemoryUnmapCallback nmemory_unmap(long struct) { return RPMemoryUnmapCallback.createSafe(memGetAddress(struct + RPMallocConfig.MEMORY_UNMAP)); }
    /** Unsafe version of {@link #error_callback}. */
    @Nullable public static RPErrorCallback nerror_callback(long struct) { return RPErrorCallback.createSafe(memGetAddress(struct + RPMallocConfig.ERROR_CALLBACK)); }
    /** Unsafe version of {@link #map_fail_callback}. */
    @Nullable public static RPMapFailCallback nmap_fail_callback(long struct) { return RPMapFailCallback.createSafe(memGetAddress(struct + RPMallocConfig.MAP_FAIL_CALLBACK)); }
    /** Unsafe version of {@link #page_size}. */
    public static long npage_size(long struct) { return memGetAddress(struct + RPMallocConfig.PAGE_SIZE); }
    /** Unsafe version of {@link #span_size}. */
    public static long nspan_size(long struct) { return memGetAddress(struct + RPMallocConfig.SPAN_SIZE); }
    /** Unsafe version of {@link #span_map_count}. */
    public static long nspan_map_count(long struct) { return memGetAddress(struct + RPMallocConfig.SPAN_MAP_COUNT); }
    /** Unsafe version of {@link #enable_huge_pages}. */
    public static int nenable_huge_pages(long struct) { return UNSAFE.getInt(null, struct + RPMallocConfig.ENABLE_HUGE_PAGES); }

    /** Unsafe version of {@link #memory_map(RPMemoryMapCallbackI) memory_map}. */
    public static void nmemory_map(long struct, @Nullable RPMemoryMapCallbackI value) { memPutAddress(struct + RPMallocConfig.MEMORY_MAP, memAddressSafe(value)); }
    /** Unsafe version of {@link #memory_unmap(RPMemoryUnmapCallbackI) memory_unmap}. */
    public static void nmemory_unmap(long struct, @Nullable RPMemoryUnmapCallbackI value) { memPutAddress(struct + RPMallocConfig.MEMORY_UNMAP, memAddressSafe(value)); }
    /** Unsafe version of {@link #error_callback(RPErrorCallbackI) error_callback}. */
    public static void nerror_callback(long struct, @Nullable RPErrorCallbackI value) { memPutAddress(struct + RPMallocConfig.ERROR_CALLBACK, memAddressSafe(value)); }
    /** Unsafe version of {@link #map_fail_callback(RPMapFailCallbackI) map_fail_callback}. */
    public static void nmap_fail_callback(long struct, @Nullable RPMapFailCallbackI value) { memPutAddress(struct + RPMallocConfig.MAP_FAIL_CALLBACK, memAddressSafe(value)); }
    /** Unsafe version of {@link #page_size(long) page_size}. */
    public static void npage_size(long struct, long value) { memPutAddress(struct + RPMallocConfig.PAGE_SIZE, value); }
    /** Unsafe version of {@link #span_size(long) span_size}. */
    public static void nspan_size(long struct, long value) { memPutAddress(struct + RPMallocConfig.SPAN_SIZE, value); }
    /** Unsafe version of {@link #span_map_count(long) span_map_count}. */
    public static void nspan_map_count(long struct, long value) { memPutAddress(struct + RPMallocConfig.SPAN_MAP_COUNT, value); }
    /** Unsafe version of {@link #enable_huge_pages(boolean) enable_huge_pages}. */
    public static void nenable_huge_pages(long struct, int value) { UNSAFE.putInt(null, struct + RPMallocConfig.ENABLE_HUGE_PAGES, value); }

}