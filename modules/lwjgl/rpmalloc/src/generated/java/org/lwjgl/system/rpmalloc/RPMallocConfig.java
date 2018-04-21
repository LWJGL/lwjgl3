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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code memory_map} &ndash; the memory map callback function</li>
 * <li>{@code memory_unmap} &ndash; the memory unmap callback function</li>
 * <li>{@code page_size} &ndash; 
 * the size of memory pages.
 * 
 * <p>The page size MUST be a power of two in {@code [512,16384]} range (2<sup>9</sup> to 2<sup>14</sup>) unless 0 - set to 0 to use system page size. All
 * memory mapping requests to {@code memory_map} will be made with size set to a multiple of the page size.</p></li>
 * <li>{@code span_size} &ndash; 
 * size of a span of memory pages.
 * 
 * <p>MUST be a multiple of page size, and in {@code [4096,262144]} range (unless 0 - set to 0 to use the default span size).</p></li>
 * <li>{@code span_map_count} &ndash; 
 * number of spans to map at each request to map new virtual memory blocks.
 * 
 * <p>This can be used to minimize the system call overhead at the cost of virtual memory address space. The extra mapped pages will not be written until
 * actually used, so physical committed memory should not be affected in the default implementation.</p></li>
 * <li>{@code memory_overwrite} &ndash; the memory overwrite callback function</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct rpmalloc_config_t {
 *     void * (*{@link RPMemoryMapCallbackI memory_map}) (size_t size, size_t *offset);
 *     void (*{@link RPMemoryUnmapCallbackI memory_unmap}) (void *address, size_t size, size_t offset, int release);
 *     size_t page_size;
 *     size_t span_size;
 *     size_t span_map_count;
 *     void (*{@link RPMemoryOverwriteCallbackI memory_overwrite}) (void *address);
 * }</pre></code>
 */
@NativeType("struct rpmalloc_config_t")
public class RPMallocConfig extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MEMORY_MAP,
        MEMORY_UNMAP,
        PAGE_SIZE,
        SPAN_SIZE,
        SPAN_MAP_COUNT,
        MEMORY_OVERWRITE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MEMORY_MAP = layout.offsetof(0);
        MEMORY_UNMAP = layout.offsetof(1);
        PAGE_SIZE = layout.offsetof(2);
        SPAN_SIZE = layout.offsetof(3);
        SPAN_MAP_COUNT = layout.offsetof(4);
        MEMORY_OVERWRITE = layout.offsetof(5);
    }

    RPMallocConfig(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link RPMallocConfig} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RPMallocConfig(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code memory_map} field. */
    @Nullable
    @NativeType("void * (*) (size_t, size_t *)")
    public RPMemoryMapCallback memory_map() { return nmemory_map(address()); }
    /** Returns the value of the {@code memory_unmap} field. */
    @Nullable
    @NativeType("void (*) (void *, size_t, size_t, int)")
    public RPMemoryUnmapCallback memory_unmap() { return nmemory_unmap(address()); }
    /** Returns the value of the {@code page_size} field. */
    @NativeType("size_t")
    public long page_size() { return npage_size(address()); }
    /** Returns the value of the {@code span_size} field. */
    @NativeType("size_t")
    public long span_size() { return nspan_size(address()); }
    /** Returns the value of the {@code span_map_count} field. */
    @NativeType("size_t")
    public long span_map_count() { return nspan_map_count(address()); }
    /** Returns the value of the {@code memory_overwrite} field. */
    @Nullable
    @NativeType("void (*) (void *)")
    public RPMemoryOverwriteCallback memory_overwrite() { return nmemory_overwrite(address()); }

    /** Sets the specified value to the {@code memory_map} field. */
    public RPMallocConfig memory_map(@Nullable @NativeType("void * (*) (size_t, size_t *)") RPMemoryMapCallbackI value) { nmemory_map(address(), value); return this; }
    /** Sets the specified value to the {@code memory_unmap} field. */
    public RPMallocConfig memory_unmap(@Nullable @NativeType("void (*) (void *, size_t, size_t, int)") RPMemoryUnmapCallbackI value) { nmemory_unmap(address(), value); return this; }
    /** Sets the specified value to the {@code page_size} field. */
    public RPMallocConfig page_size(@NativeType("size_t") long value) { npage_size(address(), value); return this; }
    /** Sets the specified value to the {@code span_size} field. */
    public RPMallocConfig span_size(@NativeType("size_t") long value) { nspan_size(address(), value); return this; }
    /** Sets the specified value to the {@code span_map_count} field. */
    public RPMallocConfig span_map_count(@NativeType("size_t") long value) { nspan_map_count(address(), value); return this; }
    /** Sets the specified value to the {@code memory_overwrite} field. */
    public RPMallocConfig memory_overwrite(@Nullable @NativeType("void (*) (void *)") RPMemoryOverwriteCallbackI value) { nmemory_overwrite(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public RPMallocConfig set(
        RPMemoryMapCallbackI memory_map,
        RPMemoryUnmapCallbackI memory_unmap,
        long page_size,
        long span_size,
        long span_map_count,
        RPMemoryOverwriteCallbackI memory_overwrite
    ) {
        memory_map(memory_map);
        memory_unmap(memory_unmap);
        page_size(page_size);
        span_size(span_size);
        span_map_count(span_map_count);
        memory_overwrite(memory_overwrite);

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

    /** Returns a new {@link RPMallocConfig} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RPMallocConfig malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link RPMallocConfig} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RPMallocConfig calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link RPMallocConfig} instance allocated with {@link BufferUtils}. */
    public static RPMallocConfig create() {
        return new RPMallocConfig(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link RPMallocConfig} instance for the specified memory address. */
    public static RPMallocConfig create(long address) {
        return new RPMallocConfig(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RPMallocConfig createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link RPMallocConfig.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RPMallocConfig.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RPMallocConfig.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RPMallocConfig.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RPMallocConfig.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static RPMallocConfig.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link RPMallocConfig.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RPMallocConfig.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RPMallocConfig.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link RPMallocConfig} instance allocated on the thread-local {@link MemoryStack}. */
    public static RPMallocConfig mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link RPMallocConfig} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static RPMallocConfig callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link RPMallocConfig} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RPMallocConfig mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link RPMallocConfig} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RPMallocConfig callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link RPMallocConfig.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static RPMallocConfig.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RPMallocConfig.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static RPMallocConfig.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RPMallocConfig.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RPMallocConfig.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RPMallocConfig.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RPMallocConfig.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #memory_map}. */
    @Nullable public static RPMemoryMapCallback nmemory_map(long struct) { return RPMemoryMapCallback.createSafe(memGetAddress(struct + RPMallocConfig.MEMORY_MAP)); }
    /** Unsafe version of {@link #memory_unmap}. */
    @Nullable public static RPMemoryUnmapCallback nmemory_unmap(long struct) { return RPMemoryUnmapCallback.createSafe(memGetAddress(struct + RPMallocConfig.MEMORY_UNMAP)); }
    /** Unsafe version of {@link #page_size}. */
    public static long npage_size(long struct) { return memGetAddress(struct + RPMallocConfig.PAGE_SIZE); }
    /** Unsafe version of {@link #span_size}. */
    public static long nspan_size(long struct) { return memGetAddress(struct + RPMallocConfig.SPAN_SIZE); }
    /** Unsafe version of {@link #span_map_count}. */
    public static long nspan_map_count(long struct) { return memGetAddress(struct + RPMallocConfig.SPAN_MAP_COUNT); }
    /** Unsafe version of {@link #memory_overwrite}. */
    @Nullable public static RPMemoryOverwriteCallback nmemory_overwrite(long struct) { return RPMemoryOverwriteCallback.createSafe(memGetAddress(struct + RPMallocConfig.MEMORY_OVERWRITE)); }

    /** Unsafe version of {@link #memory_map(RPMemoryMapCallbackI) memory_map}. */
    public static void nmemory_map(long struct, @Nullable RPMemoryMapCallbackI value) { memPutAddress(struct + RPMallocConfig.MEMORY_MAP, memAddressSafe(value)); }
    /** Unsafe version of {@link #memory_unmap(RPMemoryUnmapCallbackI) memory_unmap}. */
    public static void nmemory_unmap(long struct, @Nullable RPMemoryUnmapCallbackI value) { memPutAddress(struct + RPMallocConfig.MEMORY_UNMAP, memAddressSafe(value)); }
    /** Unsafe version of {@link #page_size(long) page_size}. */
    public static void npage_size(long struct, long value) { memPutAddress(struct + RPMallocConfig.PAGE_SIZE, value); }
    /** Unsafe version of {@link #span_size(long) span_size}. */
    public static void nspan_size(long struct, long value) { memPutAddress(struct + RPMallocConfig.SPAN_SIZE, value); }
    /** Unsafe version of {@link #span_map_count(long) span_map_count}. */
    public static void nspan_map_count(long struct, long value) { memPutAddress(struct + RPMallocConfig.SPAN_MAP_COUNT, value); }
    /** Unsafe version of {@link #memory_overwrite(RPMemoryOverwriteCallbackI) memory_overwrite}. */
    public static void nmemory_overwrite(long struct, @Nullable RPMemoryOverwriteCallbackI value) { memPutAddress(struct + RPMallocConfig.MEMORY_OVERWRITE, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link RPMallocConfig} structs. */
    public static class Buffer extends StructBuffer<RPMallocConfig, Buffer> implements NativeResource {

        /**
         * Creates a new {@link RPMallocConfig.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RPMallocConfig#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected RPMallocConfig newInstance(long address) {
            return new RPMallocConfig(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code memory_map} field. */
        @Nullable
        @NativeType("void * (*) (size_t, size_t *)")
        public RPMemoryMapCallback memory_map() { return RPMallocConfig.nmemory_map(address()); }
        /** Returns the value of the {@code memory_unmap} field. */
        @Nullable
        @NativeType("void (*) (void *, size_t, size_t, int)")
        public RPMemoryUnmapCallback memory_unmap() { return RPMallocConfig.nmemory_unmap(address()); }
        /** Returns the value of the {@code page_size} field. */
        @NativeType("size_t")
        public long page_size() { return RPMallocConfig.npage_size(address()); }
        /** Returns the value of the {@code span_size} field. */
        @NativeType("size_t")
        public long span_size() { return RPMallocConfig.nspan_size(address()); }
        /** Returns the value of the {@code span_map_count} field. */
        @NativeType("size_t")
        public long span_map_count() { return RPMallocConfig.nspan_map_count(address()); }
        /** Returns the value of the {@code memory_overwrite} field. */
        @Nullable
        @NativeType("void (*) (void *)")
        public RPMemoryOverwriteCallback memory_overwrite() { return RPMallocConfig.nmemory_overwrite(address()); }

        /** Sets the specified value to the {@code memory_map} field. */
        public RPMallocConfig.Buffer memory_map(@Nullable @NativeType("void * (*) (size_t, size_t *)") RPMemoryMapCallbackI value) { RPMallocConfig.nmemory_map(address(), value); return this; }
        /** Sets the specified value to the {@code memory_unmap} field. */
        public RPMallocConfig.Buffer memory_unmap(@Nullable @NativeType("void (*) (void *, size_t, size_t, int)") RPMemoryUnmapCallbackI value) { RPMallocConfig.nmemory_unmap(address(), value); return this; }
        /** Sets the specified value to the {@code page_size} field. */
        public RPMallocConfig.Buffer page_size(@NativeType("size_t") long value) { RPMallocConfig.npage_size(address(), value); return this; }
        /** Sets the specified value to the {@code span_size} field. */
        public RPMallocConfig.Buffer span_size(@NativeType("size_t") long value) { RPMallocConfig.nspan_size(address(), value); return this; }
        /** Sets the specified value to the {@code span_map_count} field. */
        public RPMallocConfig.Buffer span_map_count(@NativeType("size_t") long value) { RPMallocConfig.nspan_map_count(address(), value); return this; }
        /** Sets the specified value to the {@code memory_overwrite} field. */
        public RPMallocConfig.Buffer memory_overwrite(@Nullable @NativeType("void (*) (void *)") RPMemoryOverwriteCallbackI value) { RPMallocConfig.nmemory_overwrite(address(), value); return this; }

    }

}