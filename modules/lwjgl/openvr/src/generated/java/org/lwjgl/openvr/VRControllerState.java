/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Holds all the state of a controller at one moment in time.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code unPacketNum} &ndash; If packet num matches that on your prior call, then the controller state hasn't been changed since your last call and there is no need to process it.</li>
 * <li>{@code ulButtonPressed} &ndash; bit flags for each of the buttons. Use {@code ButtonMaskFromId} to turn an ID into a mask</li>
 * <li>{@code rAxis} &ndash; axis data for the controller's analog inputs</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VRControllerState_t {
 *     uint32_t unPacketNum;
 *     uint64_t ulButtonPressed;
 *     uint64_t ulButtonTouched;
 *     {@link VRControllerAxis VRControllerAxis_t} rAxis[5];
 * }</pre></code>
 */
@NativeType("struct VRControllerState_t")
public class VRControllerState extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        UNPACKETNUM,
        ULBUTTONPRESSED,
        ULBUTTONTOUCHED,
        RAXIS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8),
            __member(8),
            __array(VRControllerAxis.SIZEOF, VRControllerAxis.ALIGNOF, 5)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        UNPACKETNUM = layout.offsetof(0);
        ULBUTTONPRESSED = layout.offsetof(1);
        ULBUTTONTOUCHED = layout.offsetof(2);
        RAXIS = layout.offsetof(3);
    }

    VRControllerState(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VRControllerState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VRControllerState(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code unPacketNum} field. */
    @NativeType("uint32_t")
    public int unPacketNum() { return nunPacketNum(address()); }
    /** Returns the value of the {@code ulButtonPressed} field. */
    @NativeType("uint64_t")
    public long ulButtonPressed() { return nulButtonPressed(address()); }
    /** Returns the value of the {@code ulButtonTouched} field. */
    @NativeType("uint64_t")
    public long ulButtonTouched() { return nulButtonTouched(address()); }
    /** Returns a {@link VRControllerAxis}.Buffer view of the {@code rAxis} field. */
    @NativeType("VRControllerAxis_t[5]")
    public VRControllerAxis.Buffer rAxis() { return nrAxis(address()); }
    /** Returns a {@link VRControllerAxis} view of the struct at the specified index of the {@code rAxis} field. */
    @NativeType("VRControllerAxis_t")
    public VRControllerAxis rAxis(int index) { return nrAxis(address(), index); }

    /** Sets the specified value to the {@code unPacketNum} field. */
    public VRControllerState unPacketNum(@NativeType("uint32_t") int value) { nunPacketNum(address(), value); return this; }
    /** Sets the specified value to the {@code ulButtonPressed} field. */
    public VRControllerState ulButtonPressed(@NativeType("uint64_t") long value) { nulButtonPressed(address(), value); return this; }
    /** Sets the specified value to the {@code ulButtonTouched} field. */
    public VRControllerState ulButtonTouched(@NativeType("uint64_t") long value) { nulButtonTouched(address(), value); return this; }
    /** Copies the specified {@link VRControllerAxis.Buffer} to the {@code rAxis} field. */
    public VRControllerState rAxis(@NativeType("VRControllerAxis_t[5]") VRControllerAxis.Buffer value) { nrAxis(address(), value); return this; }
    /** Copies the specified {@link VRControllerAxis} at the specified index of the {@code rAxis} field. */
    public VRControllerState rAxis(int index, @NativeType("VRControllerAxis_t") VRControllerAxis value) { nrAxis(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public VRControllerState set(
        int unPacketNum,
        long ulButtonPressed,
        long ulButtonTouched,
        VRControllerAxis.Buffer rAxis
    ) {
        unPacketNum(unPacketNum);
        ulButtonPressed(ulButtonPressed);
        ulButtonTouched(ulButtonTouched);
        rAxis(rAxis);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VRControllerState set(VRControllerState src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VRControllerState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VRControllerState malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VRControllerState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VRControllerState calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VRControllerState} instance allocated with {@link BufferUtils}. */
    public static VRControllerState create() {
        return new VRControllerState(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VRControllerState} instance for the specified memory address. */
    public static VRControllerState create(long address) {
        return new VRControllerState(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRControllerState createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VRControllerState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRControllerState.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRControllerState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRControllerState.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRControllerState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VRControllerState.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VRControllerState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VRControllerState.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRControllerState.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VRControllerState} instance allocated on the thread-local {@link MemoryStack}. */
    public static VRControllerState mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VRControllerState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VRControllerState callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VRControllerState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VRControllerState mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VRControllerState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VRControllerState callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VRControllerState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VRControllerState.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VRControllerState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VRControllerState.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VRControllerState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRControllerState.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRControllerState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRControllerState.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #unPacketNum}. */
    public static int nunPacketNum(long struct) { return memGetInt(struct + VRControllerState.UNPACKETNUM); }
    /** Unsafe version of {@link #ulButtonPressed}. */
    public static long nulButtonPressed(long struct) { return memGetLong(struct + VRControllerState.ULBUTTONPRESSED); }
    /** Unsafe version of {@link #ulButtonTouched}. */
    public static long nulButtonTouched(long struct) { return memGetLong(struct + VRControllerState.ULBUTTONTOUCHED); }
    /** Unsafe version of {@link #rAxis}. */
    public static VRControllerAxis.Buffer nrAxis(long struct) { return VRControllerAxis.create(struct + VRControllerState.RAXIS, 5); }
    /** Unsafe version of {@link #rAxis(int) rAxis}. */
    public static VRControllerAxis nrAxis(long struct, int index) {
        return VRControllerAxis.create(struct + VRControllerState.RAXIS + check(index, 5) * VRControllerAxis.SIZEOF);
    }

    /** Unsafe version of {@link #unPacketNum(int) unPacketNum}. */
    public static void nunPacketNum(long struct, int value) { memPutInt(struct + VRControllerState.UNPACKETNUM, value); }
    /** Unsafe version of {@link #ulButtonPressed(long) ulButtonPressed}. */
    public static void nulButtonPressed(long struct, long value) { memPutLong(struct + VRControllerState.ULBUTTONPRESSED, value); }
    /** Unsafe version of {@link #ulButtonTouched(long) ulButtonTouched}. */
    public static void nulButtonTouched(long struct, long value) { memPutLong(struct + VRControllerState.ULBUTTONTOUCHED, value); }
    /** Unsafe version of {@link #rAxis(VRControllerAxis.Buffer) rAxis}. */
    public static void nrAxis(long struct, VRControllerAxis.Buffer value) {
        if (CHECKS) { checkGT(value, 5); }
        memCopy(value.address(), struct + VRControllerState.RAXIS, value.remaining() * VRControllerAxis.SIZEOF);
    }
    /** Unsafe version of {@link #rAxis(int, VRControllerAxis) rAxis}. */
    public static void nrAxis(long struct, int index, VRControllerAxis value) {
        memCopy(value.address(), struct + VRControllerState.RAXIS + check(index, 5) * VRControllerAxis.SIZEOF, VRControllerAxis.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link VRControllerState} structs. */
    public static class Buffer extends StructBuffer<VRControllerState, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VRControllerState.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VRControllerState#SIZEOF}, and its mark will be undefined.
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
        protected VRControllerState newInstance(long address) {
            return new VRControllerState(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code unPacketNum} field. */
        @NativeType("uint32_t")
        public int unPacketNum() { return VRControllerState.nunPacketNum(address()); }
        /** Returns the value of the {@code ulButtonPressed} field. */
        @NativeType("uint64_t")
        public long ulButtonPressed() { return VRControllerState.nulButtonPressed(address()); }
        /** Returns the value of the {@code ulButtonTouched} field. */
        @NativeType("uint64_t")
        public long ulButtonTouched() { return VRControllerState.nulButtonTouched(address()); }
        /** Returns a {@link VRControllerAxis}.Buffer view of the {@code rAxis} field. */
        @NativeType("VRControllerAxis_t[5]")
        public VRControllerAxis.Buffer rAxis() { return VRControllerState.nrAxis(address()); }
        /** Returns a {@link VRControllerAxis} view of the struct at the specified index of the {@code rAxis} field. */
        @NativeType("VRControllerAxis_t")
        public VRControllerAxis rAxis(int index) { return VRControllerState.nrAxis(address(), index); }

        /** Sets the specified value to the {@code unPacketNum} field. */
        public VRControllerState.Buffer unPacketNum(@NativeType("uint32_t") int value) { VRControllerState.nunPacketNum(address(), value); return this; }
        /** Sets the specified value to the {@code ulButtonPressed} field. */
        public VRControllerState.Buffer ulButtonPressed(@NativeType("uint64_t") long value) { VRControllerState.nulButtonPressed(address(), value); return this; }
        /** Sets the specified value to the {@code ulButtonTouched} field. */
        public VRControllerState.Buffer ulButtonTouched(@NativeType("uint64_t") long value) { VRControllerState.nulButtonTouched(address(), value); return this; }
        /** Copies the specified {@link VRControllerAxis.Buffer} to the {@code rAxis} field. */
        public VRControllerState.Buffer rAxis(@NativeType("VRControllerAxis_t[5]") VRControllerAxis.Buffer value) { VRControllerState.nrAxis(address(), value); return this; }
        /** Copies the specified {@link VRControllerAxis} at the specified index of the {@code rAxis} field. */
        public VRControllerState.Buffer rAxis(int index, @NativeType("VRControllerAxis_t") VRControllerAxis value) { VRControllerState.nrAxis(address(), index, value); return this; }

    }

}