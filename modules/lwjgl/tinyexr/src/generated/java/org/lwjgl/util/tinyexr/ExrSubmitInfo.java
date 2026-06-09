/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct ExrSubmitInfo {
 *     uint32_t command_buffer_count;
 *     ExrCommandBuffer const * command_buffers;
 *     ExrFence signal_fence;
 *     {@link ExrSubmitCompleteI ExrSubmitComplete} on_complete;
 *     void * userdata;
 * }</code></pre>
 */
public class ExrSubmitInfo extends Struct<ExrSubmitInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COMMAND_BUFFER_COUNT,
        COMMAND_BUFFERS,
        SIGNAL_FENCE,
        ON_COMPLETE,
        USERDATA;

    static {
        java.util.Objects.requireNonNull(ExrSubmitCompleteI.DESCRIPTOR);

        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COMMAND_BUFFER_COUNT = layout.offsetof(0);
        COMMAND_BUFFERS = layout.offsetof(1);
        SIGNAL_FENCE = layout.offsetof(2);
        ON_COMPLETE = layout.offsetof(3);
        USERDATA = layout.offsetof(4);
    }

    protected ExrSubmitInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrSubmitInfo create(long address, @Nullable ByteBuffer container) {
        return new ExrSubmitInfo(address, container);
    }

    /**
     * Creates a {@code ExrSubmitInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrSubmitInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code command_buffer_count} field. */
    @NativeType("uint32_t")
    public int command_buffer_count() { return ncommand_buffer_count(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code command_buffers} field. */
    @NativeType("ExrCommandBuffer const *")
    public PointerBuffer command_buffers() { return ncommand_buffers(address()); }
    /** @return the value of the {@code signal_fence} field. */
    @NativeType("ExrFence")
    public long signal_fence() { return nsignal_fence(address()); }
    /** @return the value of the {@code on_complete} field. */
    public @Nullable ExrSubmitComplete on_complete() { return non_complete(address()); }
    /** @return the value of the {@code userdata} field. */
    @NativeType("void *")
    public long userdata() { return nuserdata(address()); }

    /** Sets the address of the specified {@link PointerBuffer} to the {@code command_buffers} field. */
    public ExrSubmitInfo command_buffers(@NativeType("ExrCommandBuffer const *") PointerBuffer value) { ncommand_buffers(address(), value); return this; }
    /** Sets the specified value to the {@code signal_fence} field. */
    public ExrSubmitInfo signal_fence(@NativeType("ExrFence") long value) { nsignal_fence(address(), value); return this; }
    /** Sets the specified value to the {@code on_complete} field. */
    public ExrSubmitInfo on_complete(@Nullable @NativeType("ExrSubmitComplete") ExrSubmitCompleteI value) { non_complete(address(), value); return this; }
    /** Sets the specified value to the {@code userdata} field. */
    public ExrSubmitInfo userdata(@NativeType("void *") long value) { nuserdata(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrSubmitInfo set(
        PointerBuffer command_buffers,
        long signal_fence,
        @Nullable ExrSubmitCompleteI on_complete,
        long userdata
    ) {
        command_buffers(command_buffers);
        signal_fence(signal_fence);
        on_complete(on_complete);
        userdata(userdata);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExrSubmitInfo set(ExrSubmitInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrSubmitInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrSubmitInfo malloc() {
        return new ExrSubmitInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrSubmitInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrSubmitInfo calloc() {
        return new ExrSubmitInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrSubmitInfo} instance allocated with {@link BufferUtils}. */
    public static ExrSubmitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrSubmitInfo(memAddress(container), container);
    }

    /** Returns a new {@code ExrSubmitInfo} instance for the specified memory address. */
    public static ExrSubmitInfo create(long address) {
        return new ExrSubmitInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrSubmitInfo createSafe(long address) {
        return address == NULL ? null : new ExrSubmitInfo(address, null);
    }

    /**
     * Returns a new {@link ExrSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrSubmitInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrSubmitInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrSubmitInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrSubmitInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrSubmitInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrSubmitInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrSubmitInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrSubmitInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrSubmitInfo malloc(MemoryStack stack) {
        return new ExrSubmitInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrSubmitInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrSubmitInfo calloc(MemoryStack stack) {
        return new ExrSubmitInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrSubmitInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrSubmitInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #command_buffer_count}. */
    public static int ncommand_buffer_count(long struct) { return memGetInt(struct + ExrSubmitInfo.COMMAND_BUFFER_COUNT); }
    /** Unsafe version of {@link #command_buffers() command_buffers}. */
    public static PointerBuffer ncommand_buffers(long struct) { return memPointerBuffer(memGetAddress(struct + ExrSubmitInfo.COMMAND_BUFFERS), ncommand_buffer_count(struct)); }
    /** Unsafe version of {@link #signal_fence}. */
    public static long nsignal_fence(long struct) { return memGetAddress(struct + ExrSubmitInfo.SIGNAL_FENCE); }
    /** Unsafe version of {@link #on_complete}. */
    public static @Nullable ExrSubmitComplete non_complete(long struct) { return ExrSubmitComplete.createSafe(memGetAddress(struct + ExrSubmitInfo.ON_COMPLETE)); }
    /** Unsafe version of {@link #userdata}. */
    public static long nuserdata(long struct) { return memGetAddress(struct + ExrSubmitInfo.USERDATA); }

    /** Sets the specified value to the {@code command_buffer_count} field of the specified {@code struct}. */
    public static void ncommand_buffer_count(long struct, int value) { memPutInt(struct + ExrSubmitInfo.COMMAND_BUFFER_COUNT, value); }
    /** Unsafe version of {@link #command_buffers(PointerBuffer) command_buffers}. */
    public static void ncommand_buffers(long struct, PointerBuffer value) { memPutAddress(struct + ExrSubmitInfo.COMMAND_BUFFERS, memAddress(value)); ncommand_buffer_count(struct, value.remaining()); }
    /** Unsafe version of {@link #signal_fence(long) signal_fence}. */
    public static void nsignal_fence(long struct, long value) { memPutAddress(struct + ExrSubmitInfo.SIGNAL_FENCE, value); }
    /** Unsafe version of {@link #on_complete(ExrSubmitCompleteI) on_complete}. */
    public static void non_complete(long struct, @Nullable ExrSubmitCompleteI value) { memPutAddress(struct + ExrSubmitInfo.ON_COMPLETE, memAddressSafe(value)); }
    /** Unsafe version of {@link #userdata(long) userdata}. */
    public static void nuserdata(long struct, long value) { memPutAddress(struct + ExrSubmitInfo.USERDATA, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrSubmitInfo.COMMAND_BUFFERS));
    }

    // -----------------------------------

    /** An array of {@link ExrSubmitInfo} structs. */
    public static class Buffer extends StructBuffer<ExrSubmitInfo, Buffer> implements NativeResource {

        private static final ExrSubmitInfo ELEMENT_FACTORY = ExrSubmitInfo.create(-1L);

        /**
         * Creates a new {@code ExrSubmitInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrSubmitInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrSubmitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code command_buffer_count} field. */
        @NativeType("uint32_t")
        public int command_buffer_count() { return ExrSubmitInfo.ncommand_buffer_count(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code command_buffers} field. */
        @NativeType("ExrCommandBuffer const *")
        public PointerBuffer command_buffers() { return ExrSubmitInfo.ncommand_buffers(address()); }
        /** @return the value of the {@code signal_fence} field. */
        @NativeType("ExrFence")
        public long signal_fence() { return ExrSubmitInfo.nsignal_fence(address()); }
        /** @return the value of the {@code on_complete} field. */
        public @Nullable ExrSubmitComplete on_complete() { return ExrSubmitInfo.non_complete(address()); }
        /** @return the value of the {@code userdata} field. */
        @NativeType("void *")
        public long userdata() { return ExrSubmitInfo.nuserdata(address()); }

        /** Sets the address of the specified {@link PointerBuffer} to the {@code command_buffers} field. */
        public ExrSubmitInfo.Buffer command_buffers(@NativeType("ExrCommandBuffer const *") PointerBuffer value) { ExrSubmitInfo.ncommand_buffers(address(), value); return this; }
        /** Sets the specified value to the {@code signal_fence} field. */
        public ExrSubmitInfo.Buffer signal_fence(@NativeType("ExrFence") long value) { ExrSubmitInfo.nsignal_fence(address(), value); return this; }
        /** Sets the specified value to the {@code on_complete} field. */
        public ExrSubmitInfo.Buffer on_complete(@Nullable @NativeType("ExrSubmitComplete") ExrSubmitCompleteI value) { ExrSubmitInfo.non_complete(address(), value); return this; }
        /** Sets the specified value to the {@code userdata} field. */
        public ExrSubmitInfo.Buffer userdata(@NativeType("void *") long value) { ExrSubmitInfo.nuserdata(address(), value); return this; }

    }

}