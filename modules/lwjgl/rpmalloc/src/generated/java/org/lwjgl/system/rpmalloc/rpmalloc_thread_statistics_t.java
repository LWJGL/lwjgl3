/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct rpmalloc_thread_statistics_t {
 *     size_t sizecache;
 *     size_t spancache;
 *     size_t thread_to_global;
 *     size_t global_to_thread;
 *     struct {
 *         size_t current;
 *         size_t map_calls;
 *     } {@link span_use span_use}[5];
 *     struct {
 *         size_t alloc_current;
 *         size_t alloc_peak;
 *         size_t alloc_total;
 *         size_t free_total;
 *     } {@link size_use size_use}[128];
 * }</code></pre>
 */
public class rpmalloc_thread_statistics_t extends Struct<rpmalloc_thread_statistics_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIZECACHE,
        SPANCACHE,
        THREAD_TO_GLOBAL,
        GLOBAL_TO_THREAD,
        SPAN_USE,
        SIZE_USE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __array(span_use.SIZEOF, span_use.ALIGNOF, 5),
            __array(size_use.SIZEOF, size_use.ALIGNOF, 128)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZECACHE = layout.offsetof(0);
        SPANCACHE = layout.offsetof(1);
        THREAD_TO_GLOBAL = layout.offsetof(2);
        GLOBAL_TO_THREAD = layout.offsetof(3);
        SPAN_USE = layout.offsetof(4);
        SIZE_USE = layout.offsetof(5);
    }

    protected rpmalloc_thread_statistics_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected rpmalloc_thread_statistics_t create(long address, @Nullable ByteBuffer container) {
        return new rpmalloc_thread_statistics_t(address, container);
    }

    /**
     * Creates a {@code rpmalloc_thread_statistics_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public rpmalloc_thread_statistics_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sizecache} field. */
    @NativeType("size_t")
    public long sizecache() { return nsizecache(address()); }
    /** @return the value of the {@code spancache} field. */
    @NativeType("size_t")
    public long spancache() { return nspancache(address()); }
    /** @return the value of the {@code thread_to_global} field. */
    @NativeType("size_t")
    public long thread_to_global() { return nthread_to_global(address()); }
    /** @return the value of the {@code global_to_thread} field. */
    @NativeType("size_t")
    public long global_to_thread() { return nglobal_to_thread(address()); }
    /** @return a {@link span_use}.Buffer view of the {@code span_use} field. */
    @NativeType("*[5]")
    public span_use.Buffer span_use() { return nspan_use(address()); }
    /** @return a {@link span_use} view of the struct at the specified index of the {@code span_use} field. */
    @NativeType("*")
    public span_use span_use(int index) { return nspan_use(address(), index); }
    /** @return a {@link size_use}.Buffer view of the {@code size_use} field. */
    @NativeType("*[128]")
    public size_use.Buffer size_use() { return nsize_use(address()); }
    /** @return a {@link size_use} view of the struct at the specified index of the {@code size_use} field. */
    @NativeType("*")
    public size_use size_use(int index) { return nsize_use(address(), index); }

    // -----------------------------------

    /** Returns a new {@code rpmalloc_thread_statistics_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static rpmalloc_thread_statistics_t malloc() {
        return new rpmalloc_thread_statistics_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code rpmalloc_thread_statistics_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static rpmalloc_thread_statistics_t calloc() {
        return new rpmalloc_thread_statistics_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code rpmalloc_thread_statistics_t} instance allocated with {@link BufferUtils}. */
    public static rpmalloc_thread_statistics_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new rpmalloc_thread_statistics_t(memAddress(container), container);
    }

    /** Returns a new {@code rpmalloc_thread_statistics_t} instance for the specified memory address. */
    public static rpmalloc_thread_statistics_t create(long address) {
        return new rpmalloc_thread_statistics_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable rpmalloc_thread_statistics_t createSafe(long address) {
        return address == NULL ? null : new rpmalloc_thread_statistics_t(address, null);
    }

    /**
     * Returns a new {@link rpmalloc_thread_statistics_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static rpmalloc_thread_statistics_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link rpmalloc_thread_statistics_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static rpmalloc_thread_statistics_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link rpmalloc_thread_statistics_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static rpmalloc_thread_statistics_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link rpmalloc_thread_statistics_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static rpmalloc_thread_statistics_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static rpmalloc_thread_statistics_t.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code rpmalloc_thread_statistics_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static rpmalloc_thread_statistics_t malloc(MemoryStack stack) {
        return new rpmalloc_thread_statistics_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code rpmalloc_thread_statistics_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static rpmalloc_thread_statistics_t calloc(MemoryStack stack) {
        return new rpmalloc_thread_statistics_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link rpmalloc_thread_statistics_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static rpmalloc_thread_statistics_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link rpmalloc_thread_statistics_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static rpmalloc_thread_statistics_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sizecache}. */
    public static long nsizecache(long struct) { return memGetAddress(struct + rpmalloc_thread_statistics_t.SIZECACHE); }
    /** Unsafe version of {@link #spancache}. */
    public static long nspancache(long struct) { return memGetAddress(struct + rpmalloc_thread_statistics_t.SPANCACHE); }
    /** Unsafe version of {@link #thread_to_global}. */
    public static long nthread_to_global(long struct) { return memGetAddress(struct + rpmalloc_thread_statistics_t.THREAD_TO_GLOBAL); }
    /** Unsafe version of {@link #global_to_thread}. */
    public static long nglobal_to_thread(long struct) { return memGetAddress(struct + rpmalloc_thread_statistics_t.GLOBAL_TO_THREAD); }
    /** Unsafe version of {@link #span_use}. */
    public static span_use.Buffer nspan_use(long struct) { return span_use.create(struct + rpmalloc_thread_statistics_t.SPAN_USE, 5); }
    /** Unsafe version of {@link #span_use(int) span_use}. */
    public static span_use nspan_use(long struct, int index) {
        return span_use.create(struct + rpmalloc_thread_statistics_t.SPAN_USE + check(index, 5) * span_use.SIZEOF);
    }
    /** Unsafe version of {@link #size_use}. */
    public static size_use.Buffer nsize_use(long struct) { return size_use.create(struct + rpmalloc_thread_statistics_t.SIZE_USE, 128); }
    /** Unsafe version of {@link #size_use(int) size_use}. */
    public static size_use nsize_use(long struct, int index) {
        return size_use.create(struct + rpmalloc_thread_statistics_t.SIZE_USE + check(index, 128) * size_use.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link rpmalloc_thread_statistics_t} structs. */
    public static class Buffer extends StructBuffer<rpmalloc_thread_statistics_t, Buffer> implements NativeResource {

        private static final rpmalloc_thread_statistics_t ELEMENT_FACTORY = rpmalloc_thread_statistics_t.create(-1L);

        /**
         * Creates a new {@code rpmalloc_thread_statistics_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link rpmalloc_thread_statistics_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected rpmalloc_thread_statistics_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sizecache} field. */
        @NativeType("size_t")
        public long sizecache() { return rpmalloc_thread_statistics_t.nsizecache(address()); }
        /** @return the value of the {@code spancache} field. */
        @NativeType("size_t")
        public long spancache() { return rpmalloc_thread_statistics_t.nspancache(address()); }
        /** @return the value of the {@code thread_to_global} field. */
        @NativeType("size_t")
        public long thread_to_global() { return rpmalloc_thread_statistics_t.nthread_to_global(address()); }
        /** @return the value of the {@code global_to_thread} field. */
        @NativeType("size_t")
        public long global_to_thread() { return rpmalloc_thread_statistics_t.nglobal_to_thread(address()); }
        /** @return a {@link span_use}.Buffer view of the {@code span_use} field. */
        @NativeType("*[5]")
        public span_use.Buffer span_use() { return rpmalloc_thread_statistics_t.nspan_use(address()); }
        /** @return a {@link span_use} view of the struct at the specified index of the {@code span_use} field. */
        @NativeType("*")
        public span_use span_use(int index) { return rpmalloc_thread_statistics_t.nspan_use(address(), index); }
        /** @return a {@link size_use}.Buffer view of the {@code size_use} field. */
        @NativeType("*[128]")
        public size_use.Buffer size_use() { return rpmalloc_thread_statistics_t.nsize_use(address()); }
        /** @return a {@link size_use} view of the struct at the specified index of the {@code size_use} field. */
        @NativeType("*")
        public size_use size_use(int index) { return rpmalloc_thread_statistics_t.nsize_use(address(), index); }

    }

    /**
     * <pre>{@code
     * struct {
     *     size_t current;
     *     size_t map_calls;
     * }}</pre>
     */
    @NativeType("struct")
    public static class span_use extends Struct<span_use> {
    
        /** The struct size in bytes. */
        public static final int SIZEOF;
    
        /** The struct alignment in bytes. */
        public static final int ALIGNOF;
    
        /** The struct member offsets. */
        public static final int
            CURRENT,
            MAP_CALLS;
    
        static {
            Layout layout = __struct(
                __member(POINTER_SIZE),
                __member(POINTER_SIZE)
            );
    
            SIZEOF = layout.getSize();
            ALIGNOF = layout.getAlignment();
    
            CURRENT = layout.offsetof(0);
            MAP_CALLS = layout.offsetof(1);
        }
    
        protected span_use(long address, @Nullable ByteBuffer container) {
            super(address, container);
        }
    
        @Override
        protected span_use create(long address, @Nullable ByteBuffer container) {
            return new span_use(address, container);
        }
    
        /**
         * Creates a {@code span_use} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
         * visible to the struct instance and vice versa.
         *
         * <p>The created instance holds a strong reference to the container object.</p>
         */
        public span_use(ByteBuffer container) {
            super(memAddress(container), __checkContainer(container, SIZEOF));
        }
    
        @Override
        public int sizeof() { return SIZEOF; }
    
        /** @return the value of the {@code current} field. */
        @NativeType("size_t")
        public long current() { return ncurrent(address()); }
        /** @return the value of the {@code map_calls} field. */
        @NativeType("size_t")
        public long map_calls() { return nmap_calls(address()); }
    
        // -----------------------------------
    
        /** Returns a new {@code span_use} instance for the specified memory address. */
        public static span_use create(long address) {
            return new span_use(address, null);
        }
    
        /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
        public static @Nullable span_use createSafe(long address) {
            return address == NULL ? null : new span_use(address, null);
        }
    
        /**
         * Create a {@link span_use.Buffer} instance at the specified memory.
         *
         * @param address  the memory address
         * @param capacity the buffer capacity
         */
        public static span_use.Buffer create(long address, int capacity) {
            return new Buffer(address, capacity);
        }
    
        /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
        public static span_use.@Nullable Buffer createSafe(long address, int capacity) {
            return address == NULL ? null : new Buffer(address, capacity);
        }
    
        // -----------------------------------
    
        /** Unsafe version of {@link #current}. */
        public static long ncurrent(long struct) { return memGetAddress(struct + span_use.CURRENT); }
        /** Unsafe version of {@link #map_calls}. */
        public static long nmap_calls(long struct) { return memGetAddress(struct + span_use.MAP_CALLS); }
    
        // -----------------------------------
    
        /** An array of {@link span_use} structs. */
        public static class Buffer extends StructBuffer<span_use, Buffer> {
    
            private static final span_use ELEMENT_FACTORY = span_use.create(-1L);
    
            /**
             * Creates a new {@code span_use.Buffer} instance backed by the specified container.
             *
             * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
             * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
             * by {@link span_use#SIZEOF}, and its mark will be undefined.</p>
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
            protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
                return new Buffer(address, container, mark, position, limit, capacity);
            }
    
            @Override
            protected span_use getElementFactory() {
                return ELEMENT_FACTORY;
            }
    
            /** @return the value of the {@code current} field. */
            @NativeType("size_t")
            public long current() { return span_use.ncurrent(address()); }
            /** @return the value of the {@code map_calls} field. */
            @NativeType("size_t")
            public long map_calls() { return span_use.nmap_calls(address()); }
    
        }
    
    }

    /**
     * <pre>{@code
     * struct {
     *     size_t alloc_current;
     *     size_t alloc_peak;
     *     size_t alloc_total;
     *     size_t free_total;
     * }}</pre>
     */
    @NativeType("struct")
    public static class size_use extends Struct<size_use> {
    
        /** The struct size in bytes. */
        public static final int SIZEOF;
    
        /** The struct alignment in bytes. */
        public static final int ALIGNOF;
    
        /** The struct member offsets. */
        public static final int
            ALLOC_CURRENT,
            ALLOC_PEAK,
            ALLOC_TOTAL,
            FREE_TOTAL;
    
        static {
            Layout layout = __struct(
                __member(POINTER_SIZE),
                __member(POINTER_SIZE),
                __member(POINTER_SIZE),
                __member(POINTER_SIZE)
            );
    
            SIZEOF = layout.getSize();
            ALIGNOF = layout.getAlignment();
    
            ALLOC_CURRENT = layout.offsetof(0);
            ALLOC_PEAK = layout.offsetof(1);
            ALLOC_TOTAL = layout.offsetof(2);
            FREE_TOTAL = layout.offsetof(3);
        }
    
        protected size_use(long address, @Nullable ByteBuffer container) {
            super(address, container);
        }
    
        @Override
        protected size_use create(long address, @Nullable ByteBuffer container) {
            return new size_use(address, container);
        }
    
        /**
         * Creates a {@code size_use} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
         * visible to the struct instance and vice versa.
         *
         * <p>The created instance holds a strong reference to the container object.</p>
         */
        public size_use(ByteBuffer container) {
            super(memAddress(container), __checkContainer(container, SIZEOF));
        }
    
        @Override
        public int sizeof() { return SIZEOF; }
    
        /** @return the value of the {@code alloc_current} field. */
        @NativeType("size_t")
        public long alloc_current() { return nalloc_current(address()); }
        /** @return the value of the {@code alloc_peak} field. */
        @NativeType("size_t")
        public long alloc_peak() { return nalloc_peak(address()); }
        /** @return the value of the {@code alloc_total} field. */
        @NativeType("size_t")
        public long alloc_total() { return nalloc_total(address()); }
        /** @return the value of the {@code free_total} field. */
        @NativeType("size_t")
        public long free_total() { return nfree_total(address()); }
    
        // -----------------------------------
    
        /** Returns a new {@code size_use} instance for the specified memory address. */
        public static size_use create(long address) {
            return new size_use(address, null);
        }
    
        /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
        public static @Nullable size_use createSafe(long address) {
            return address == NULL ? null : new size_use(address, null);
        }
    
        /**
         * Create a {@link size_use.Buffer} instance at the specified memory.
         *
         * @param address  the memory address
         * @param capacity the buffer capacity
         */
        public static size_use.Buffer create(long address, int capacity) {
            return new Buffer(address, capacity);
        }
    
        /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
        public static size_use.@Nullable Buffer createSafe(long address, int capacity) {
            return address == NULL ? null : new Buffer(address, capacity);
        }
    
        // -----------------------------------
    
        /** Unsafe version of {@link #alloc_current}. */
        public static long nalloc_current(long struct) { return memGetAddress(struct + size_use.ALLOC_CURRENT); }
        /** Unsafe version of {@link #alloc_peak}. */
        public static long nalloc_peak(long struct) { return memGetAddress(struct + size_use.ALLOC_PEAK); }
        /** Unsafe version of {@link #alloc_total}. */
        public static long nalloc_total(long struct) { return memGetAddress(struct + size_use.ALLOC_TOTAL); }
        /** Unsafe version of {@link #free_total}. */
        public static long nfree_total(long struct) { return memGetAddress(struct + size_use.FREE_TOTAL); }
    
        // -----------------------------------
    
        /** An array of {@link size_use} structs. */
        public static class Buffer extends StructBuffer<size_use, Buffer> {
    
            private static final size_use ELEMENT_FACTORY = size_use.create(-1L);
    
            /**
             * Creates a new {@code size_use.Buffer} instance backed by the specified container.
             *
             * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
             * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
             * by {@link size_use#SIZEOF}, and its mark will be undefined.</p>
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
            protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
                return new Buffer(address, container, mark, position, limit, capacity);
            }
    
            @Override
            protected size_use getElementFactory() {
                return ELEMENT_FACTORY;
            }
    
            /** @return the value of the {@code alloc_current} field. */
            @NativeType("size_t")
            public long alloc_current() { return size_use.nalloc_current(address()); }
            /** @return the value of the {@code alloc_peak} field. */
            @NativeType("size_t")
            public long alloc_peak() { return size_use.nalloc_peak(address()); }
            /** @return the value of the {@code alloc_total} field. */
            @NativeType("size_t")
            public long alloc_total() { return size_use.nalloc_total(address()); }
            /** @return the value of the {@code free_total} field. */
            @NativeType("size_t")
            public long free_total() { return size_use.nfree_total(address()); }
    
        }
    
    }

}