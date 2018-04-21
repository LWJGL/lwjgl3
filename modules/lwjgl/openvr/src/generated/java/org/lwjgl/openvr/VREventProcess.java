/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Used for events about processes.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VREvent_Process_t {
 *     uint32_t pid;
 *     uint32_t oldPid;
 *     bool bForced;
 * }</pre></code>
 */
@NativeType("struct VREvent_Process_t")
public class VREventProcess extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PID,
        OLDPID,
        BFORCED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PID = layout.offsetof(0);
        OLDPID = layout.offsetof(1);
        BFORCED = layout.offsetof(2);
    }

    VREventProcess(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventProcess} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventProcess(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code pid} field. */
    @NativeType("uint32_t")
    public int pid() { return npid(address()); }
    /** Returns the value of the {@code oldPid} field. */
    @NativeType("uint32_t")
    public int oldPid() { return noldPid(address()); }
    /** Returns the value of the {@code bForced} field. */
    @NativeType("bool")
    public boolean bForced() { return nbForced(address()); }

    // -----------------------------------

    /** Returns a new {@link VREventProcess} instance for the specified memory address. */
    public static VREventProcess create(long address) {
        return new VREventProcess(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventProcess createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VREventProcess.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventProcess.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventProcess.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pid}. */
    public static int npid(long struct) { return memGetInt(struct + VREventProcess.PID); }
    /** Unsafe version of {@link #oldPid}. */
    public static int noldPid(long struct) { return memGetInt(struct + VREventProcess.OLDPID); }
    /** Unsafe version of {@link #bForced}. */
    public static boolean nbForced(long struct) { return memGetByte(struct + VREventProcess.BFORCED) != 0; }

    // -----------------------------------

    /** An array of {@link VREventProcess} structs. */
    public static class Buffer extends StructBuffer<VREventProcess, Buffer> {

        /**
         * Creates a new {@link VREventProcess.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventProcess#SIZEOF}, and its mark will be undefined.
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
        protected VREventProcess newInstance(long address) {
            return new VREventProcess(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code pid} field. */
        @NativeType("uint32_t")
        public int pid() { return VREventProcess.npid(address()); }
        /** Returns the value of the {@code oldPid} field. */
        @NativeType("uint32_t")
        public int oldPid() { return VREventProcess.noldPid(address()); }
        /** Returns the value of the {@code bForced} field. */
        @NativeType("bool")
        public boolean bForced() { return VREventProcess.nbForced(address()); }

    }

}