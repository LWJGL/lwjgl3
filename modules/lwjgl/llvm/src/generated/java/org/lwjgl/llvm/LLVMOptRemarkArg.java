/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Element of the "Args" list. The key might give more information about what are the semantics of the value, e.g. "Callee" will tell you that the value
 * is a symbol that names a function.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Key} &ndash; e.g. "Callee"</li>
 * <li>{@code Value} &ndash; e.g. "malloc"</li>
 * <li>{@code DebugLoc} &ndash; "DebugLoc": Optional</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LLVMOptRemarkArg {
 *     {@link LLVMOptRemarkStringRef LLVMOptRemarkStringRef} Key;
 *     {@link LLVMOptRemarkStringRef LLVMOptRemarkStringRef} Value;
 *     {@link LLVMOptRemarkDebugLoc LLVMOptRemarkDebugLoc} DebugLoc;
 * }</code></pre>
 */
public class LLVMOptRemarkArg extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        KEY,
        VALUE,
        DEBUGLOC;

    static {
        Layout layout = __struct(
            __member(LLVMOptRemarkStringRef.SIZEOF, LLVMOptRemarkStringRef.ALIGNOF),
            __member(LLVMOptRemarkStringRef.SIZEOF, LLVMOptRemarkStringRef.ALIGNOF),
            __member(LLVMOptRemarkDebugLoc.SIZEOF, LLVMOptRemarkDebugLoc.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        KEY = layout.offsetof(0);
        VALUE = layout.offsetof(1);
        DEBUGLOC = layout.offsetof(2);
    }

    /**
     * Creates a {@code LLVMOptRemarkArg} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LLVMOptRemarkArg(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link LLVMOptRemarkStringRef} view of the {@code Key} field. */
    public LLVMOptRemarkStringRef Key() { return nKey(address()); }
    /** Returns a {@link LLVMOptRemarkStringRef} view of the {@code Value} field. */
    public LLVMOptRemarkStringRef Value() { return nValue(address()); }
    /** Returns a {@link LLVMOptRemarkDebugLoc} view of the {@code DebugLoc} field. */
    public LLVMOptRemarkDebugLoc DebugLoc() { return nDebugLoc(address()); }

    // -----------------------------------

    /** Returns a new {@code LLVMOptRemarkArg} instance for the specified memory address. */
    public static LLVMOptRemarkArg create(long address) {
        return wrap(LLVMOptRemarkArg.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOptRemarkArg createSafe(long address) {
        return address == NULL ? null : wrap(LLVMOptRemarkArg.class, address);
    }

    /**
     * Create a {@link LLVMOptRemarkArg.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMOptRemarkArg.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOptRemarkArg.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Key}. */
    public static LLVMOptRemarkStringRef nKey(long struct) { return LLVMOptRemarkStringRef.create(struct + LLVMOptRemarkArg.KEY); }
    /** Unsafe version of {@link #Value}. */
    public static LLVMOptRemarkStringRef nValue(long struct) { return LLVMOptRemarkStringRef.create(struct + LLVMOptRemarkArg.VALUE); }
    /** Unsafe version of {@link #DebugLoc}. */
    public static LLVMOptRemarkDebugLoc nDebugLoc(long struct) { return LLVMOptRemarkDebugLoc.create(struct + LLVMOptRemarkArg.DEBUGLOC); }

    // -----------------------------------

    /** An array of {@link LLVMOptRemarkArg} structs. */
    public static class Buffer extends StructBuffer<LLVMOptRemarkArg, Buffer> {

        private static final LLVMOptRemarkArg ELEMENT_FACTORY = LLVMOptRemarkArg.create(-1L);

        /**
         * Creates a new {@code LLVMOptRemarkArg.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMOptRemarkArg#SIZEOF}, and its mark will be undefined.
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
        protected LLVMOptRemarkArg getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link LLVMOptRemarkStringRef} view of the {@code Key} field. */
        public LLVMOptRemarkStringRef Key() { return LLVMOptRemarkArg.nKey(address()); }
        /** Returns a {@link LLVMOptRemarkStringRef} view of the {@code Value} field. */
        public LLVMOptRemarkStringRef Value() { return LLVMOptRemarkArg.nValue(address()); }
        /** Returns a {@link LLVMOptRemarkDebugLoc} view of the {@code DebugLoc} field. */
        public LLVMOptRemarkDebugLoc DebugLoc() { return LLVMOptRemarkArg.nDebugLoc(address()); }

    }

}