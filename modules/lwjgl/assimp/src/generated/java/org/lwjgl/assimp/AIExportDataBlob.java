/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes a blob of exported scene data. Use {@link Assimp#aiExportSceneToBlob ExportSceneToBlob} to create a blob containing an exported scene. The memory referred by this structure
 * is owned by Assimp. to free its resources. Don't try to free the memory on your side - it will crash for most build configurations due to conflicting
 * heaps.
 * 
 * <p>Blobs can be nested - each blob may reference another blob, which may in turn reference another blob and so on. This is used when exporters write more
 * than one output file for a given {@link AIScene}. See the remarks for {@code aiExportDataBlob::name} for more information.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiExportDataBlob {
 *     size_t {@link #size};
 *     void * {@link #data};
 *     {@link AIString struct aiString} {@link #name};
 *     {@link AIExportDataBlob struct aiExportDataBlob} * {@link #next};
 * }</code></pre>
 */
@NativeType("struct aiExportDataBlob")
public class AIExportDataBlob extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIZE,
        DATA,
        NAME,
        NEXT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZE = layout.offsetof(0);
        DATA = layout.offsetof(1);
        NAME = layout.offsetof(2);
        NEXT = layout.offsetof(3);
    }

    /**
     * Creates a {@code AIExportDataBlob} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIExportDataBlob(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Size of the data in bytes */
    @NativeType("size_t")
    public long size() { return nsize(address()); }
    /** The data. */
    @NativeType("void *")
    public ByteBuffer data() { return ndata(address()); }
    /**
     * Name of the blob. An empty string always indicates the first (and primary) blob, which contains the actual file data. Any other blobs are auxiliary
     * files produced by exporters (i.e. material files). Existence of such files depends on the file format. Most formats don't split assets across multiple
     * files.
     * 
     * <p>If used, blob names usually contain the file extension that should be used when writing the data to disc.</p>
     * 
     * <p>The blob names generated can be influenced by setting the {@link Assimp#AI_CONFIG_EXPORT_BLOB_NAME} export property to the name that is used for the master blob. All
     * other names are typically derived from the base name, by the file format exporter.</p>
     */
    @NativeType("struct aiString")
    public AIString name() { return nname(address()); }
    /** Pointer to the next blob in the chain or NULL if there is none. */
    @Nullable
    @NativeType("struct aiExportDataBlob *")
    public AIExportDataBlob next() { return nnext(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@link #data} field. */
    public AIExportDataBlob data(@NativeType("void *") ByteBuffer value) { ndata(address(), value); return this; }
    /** Copies the specified {@link AIString} to the {@link #name} field. */
    public AIExportDataBlob name(@NativeType("struct aiString") AIString value) { nname(address(), value); return this; }
    /** Passes the {@link #name} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AIExportDataBlob name(java.util.function.Consumer<AIString> consumer) { consumer.accept(name()); return this; }
    /** Sets the address of the specified {@link AIExportDataBlob} to the {@link #next} field. */
    public AIExportDataBlob next(@Nullable @NativeType("struct aiExportDataBlob *") AIExportDataBlob value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIExportDataBlob set(
        ByteBuffer data,
        AIString name,
        @Nullable AIExportDataBlob next
    ) {
        data(data);
        name(name);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIExportDataBlob set(AIExportDataBlob src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIExportDataBlob} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIExportDataBlob malloc() {
        return wrap(AIExportDataBlob.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AIExportDataBlob} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIExportDataBlob calloc() {
        return wrap(AIExportDataBlob.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AIExportDataBlob} instance allocated with {@link BufferUtils}. */
    public static AIExportDataBlob create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AIExportDataBlob.class, memAddress(container), container);
    }

    /** Returns a new {@code AIExportDataBlob} instance for the specified memory address. */
    public static AIExportDataBlob create(long address) {
        return wrap(AIExportDataBlob.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIExportDataBlob createSafe(long address) {
        return address == NULL ? null : wrap(AIExportDataBlob.class, address);
    }

    /**
     * Returns a new {@link AIExportDataBlob.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIExportDataBlob.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIExportDataBlob.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIExportDataBlob.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIExportDataBlob.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIExportDataBlob.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AIExportDataBlob.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIExportDataBlob.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIExportDataBlob.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIExportDataBlob mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIExportDataBlob callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIExportDataBlob mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIExportDataBlob callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIExportDataBlob.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIExportDataBlob.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIExportDataBlob.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIExportDataBlob.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIExportDataBlob} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIExportDataBlob malloc(MemoryStack stack) {
        return wrap(AIExportDataBlob.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AIExportDataBlob} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIExportDataBlob calloc(MemoryStack stack) {
        return wrap(AIExportDataBlob.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIExportDataBlob.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIExportDataBlob.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIExportDataBlob.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIExportDataBlob.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetAddress(struct + AIExportDataBlob.SIZE); }
    /** Unsafe version of {@link #data() data}. */
    public static ByteBuffer ndata(long struct) { return memByteBuffer(memGetAddress(struct + AIExportDataBlob.DATA), (int)nsize(struct)); }
    /** Unsafe version of {@link #name}. */
    public static AIString nname(long struct) { return AIString.create(struct + AIExportDataBlob.NAME); }
    /** Unsafe version of {@link #next}. */
    @Nullable public static AIExportDataBlob nnext(long struct) { return AIExportDataBlob.createSafe(memGetAddress(struct + AIExportDataBlob.NEXT)); }

    /** Sets the specified value to the {@code size} field of the specified {@code struct}. */
    public static void nsize(long struct, long value) { memPutAddress(struct + AIExportDataBlob.SIZE, value); }
    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) { memPutAddress(struct + AIExportDataBlob.DATA, memAddress(value)); nsize(struct, value.remaining()); }
    /** Unsafe version of {@link #name(AIString) name}. */
    public static void nname(long struct, AIString value) { memCopy(value.address(), struct + AIExportDataBlob.NAME, AIString.SIZEOF); }
    /** Unsafe version of {@link #next(AIExportDataBlob) next}. */
    public static void nnext(long struct, @Nullable AIExportDataBlob value) { memPutAddress(struct + AIExportDataBlob.NEXT, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AIExportDataBlob.DATA));
    }

    // -----------------------------------

    /** An array of {@link AIExportDataBlob} structs. */
    public static class Buffer extends StructBuffer<AIExportDataBlob, Buffer> implements NativeResource {

        private static final AIExportDataBlob ELEMENT_FACTORY = AIExportDataBlob.create(-1L);

        /**
         * Creates a new {@code AIExportDataBlob.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIExportDataBlob#SIZEOF}, and its mark will be undefined.
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
        protected AIExportDataBlob getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link AIExportDataBlob#size} field. */
        @NativeType("size_t")
        public long size() { return AIExportDataBlob.nsize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link AIExportDataBlob#data} field. */
        @NativeType("void *")
        public ByteBuffer data() { return AIExportDataBlob.ndata(address()); }
        /** @return a {@link AIString} view of the {@link AIExportDataBlob#name} field. */
        @NativeType("struct aiString")
        public AIString name() { return AIExportDataBlob.nname(address()); }
        /** @return a {@link AIExportDataBlob} view of the struct pointed to by the {@link AIExportDataBlob#next} field. */
        @Nullable
        @NativeType("struct aiExportDataBlob *")
        public AIExportDataBlob next() { return AIExportDataBlob.nnext(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@link AIExportDataBlob#data} field. */
        public AIExportDataBlob.Buffer data(@NativeType("void *") ByteBuffer value) { AIExportDataBlob.ndata(address(), value); return this; }
        /** Copies the specified {@link AIString} to the {@link AIExportDataBlob#name} field. */
        public AIExportDataBlob.Buffer name(@NativeType("struct aiString") AIString value) { AIExportDataBlob.nname(address(), value); return this; }
        /** Passes the {@link AIExportDataBlob#name} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AIExportDataBlob.Buffer name(java.util.function.Consumer<AIString> consumer) { consumer.accept(name()); return this; }
        /** Sets the address of the specified {@link AIExportDataBlob} to the {@link AIExportDataBlob#next} field. */
        public AIExportDataBlob.Buffer next(@Nullable @NativeType("struct aiExportDataBlob *") AIExportDataBlob value) { AIExportDataBlob.nnext(address(), value); return this; }

    }

}