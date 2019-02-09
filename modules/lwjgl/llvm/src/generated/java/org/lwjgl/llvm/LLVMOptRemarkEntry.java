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
 * One remark entry.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code RemarkType} &ndash; e.g. !Missed, !Passed</li>
 * <li>{@code PassName} &ndash; "Pass": Required</li>
 * <li>{@code RemarkName} &ndash; "Name": Required</li>
 * <li>{@code FunctionName} &ndash; "Function": Required</li>
 * <li>{@code DebugLoc} &ndash; "DebugLoc": Optional</li>
 * <li>{@code Hotness} &ndash; "Hotness": Optional</li>
 * <li>{@code Args} &ndash; "Args": Optional. It is an array of {@code NumArgs} elements.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LLVMOptRemarkEntry {
 *     {@link LLVMOptRemarkStringRef LLVMOptRemarkStringRef} RemarkType;
 *     {@link LLVMOptRemarkStringRef LLVMOptRemarkStringRef} PassName;
 *     {@link LLVMOptRemarkStringRef LLVMOptRemarkStringRef} RemarkName;
 *     {@link LLVMOptRemarkStringRef LLVMOptRemarkStringRef} FunctionName;
 *     {@link LLVMOptRemarkDebugLoc LLVMOptRemarkDebugLoc} DebugLoc;
 *     uint32_t Hotness;
 *     uint32_t NumArgs;
 *     {@link LLVMOptRemarkArg LLVMOptRemarkArg} * Args;
 * }</code></pre>
 */
public class LLVMOptRemarkEntry extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        REMARKTYPE,
        PASSNAME,
        REMARKNAME,
        FUNCTIONNAME,
        DEBUGLOC,
        HOTNESS,
        NUMARGS,
        ARGS;

    static {
        Layout layout = __struct(
            __member(LLVMOptRemarkStringRef.SIZEOF, LLVMOptRemarkStringRef.ALIGNOF),
            __member(LLVMOptRemarkStringRef.SIZEOF, LLVMOptRemarkStringRef.ALIGNOF),
            __member(LLVMOptRemarkStringRef.SIZEOF, LLVMOptRemarkStringRef.ALIGNOF),
            __member(LLVMOptRemarkStringRef.SIZEOF, LLVMOptRemarkStringRef.ALIGNOF),
            __member(LLVMOptRemarkDebugLoc.SIZEOF, LLVMOptRemarkDebugLoc.ALIGNOF),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        REMARKTYPE = layout.offsetof(0);
        PASSNAME = layout.offsetof(1);
        REMARKNAME = layout.offsetof(2);
        FUNCTIONNAME = layout.offsetof(3);
        DEBUGLOC = layout.offsetof(4);
        HOTNESS = layout.offsetof(5);
        NUMARGS = layout.offsetof(6);
        ARGS = layout.offsetof(7);
    }

    /**
     * Creates a {@code LLVMOptRemarkEntry} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LLVMOptRemarkEntry(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link LLVMOptRemarkStringRef} view of the {@code RemarkType} field. */
    public LLVMOptRemarkStringRef RemarkType() { return nRemarkType(address()); }
    /** Returns a {@link LLVMOptRemarkStringRef} view of the {@code PassName} field. */
    public LLVMOptRemarkStringRef PassName() { return nPassName(address()); }
    /** Returns a {@link LLVMOptRemarkStringRef} view of the {@code RemarkName} field. */
    public LLVMOptRemarkStringRef RemarkName() { return nRemarkName(address()); }
    /** Returns a {@link LLVMOptRemarkStringRef} view of the {@code FunctionName} field. */
    public LLVMOptRemarkStringRef FunctionName() { return nFunctionName(address()); }
    /** Returns a {@link LLVMOptRemarkDebugLoc} view of the {@code DebugLoc} field. */
    public LLVMOptRemarkDebugLoc DebugLoc() { return nDebugLoc(address()); }
    /** Returns the value of the {@code Hotness} field. */
    @NativeType("uint32_t")
    public int Hotness() { return nHotness(address()); }
    /** Returns the value of the {@code NumArgs} field. */
    @NativeType("uint32_t")
    public int NumArgs() { return nNumArgs(address()); }
    /** Returns a {@link LLVMOptRemarkArg.Buffer} view of the struct array pointed to by the {@code Args} field. */
    @NativeType("LLVMOptRemarkArg *")
    public LLVMOptRemarkArg.Buffer Args() { return nArgs(address()); }

    // -----------------------------------

    /** Returns a new {@code LLVMOptRemarkEntry} instance for the specified memory address. */
    public static LLVMOptRemarkEntry create(long address) {
        return wrap(LLVMOptRemarkEntry.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOptRemarkEntry createSafe(long address) {
        return address == NULL ? null : wrap(LLVMOptRemarkEntry.class, address);
    }

    /**
     * Create a {@link LLVMOptRemarkEntry.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMOptRemarkEntry.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOptRemarkEntry.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #RemarkType}. */
    public static LLVMOptRemarkStringRef nRemarkType(long struct) { return LLVMOptRemarkStringRef.create(struct + LLVMOptRemarkEntry.REMARKTYPE); }
    /** Unsafe version of {@link #PassName}. */
    public static LLVMOptRemarkStringRef nPassName(long struct) { return LLVMOptRemarkStringRef.create(struct + LLVMOptRemarkEntry.PASSNAME); }
    /** Unsafe version of {@link #RemarkName}. */
    public static LLVMOptRemarkStringRef nRemarkName(long struct) { return LLVMOptRemarkStringRef.create(struct + LLVMOptRemarkEntry.REMARKNAME); }
    /** Unsafe version of {@link #FunctionName}. */
    public static LLVMOptRemarkStringRef nFunctionName(long struct) { return LLVMOptRemarkStringRef.create(struct + LLVMOptRemarkEntry.FUNCTIONNAME); }
    /** Unsafe version of {@link #DebugLoc}. */
    public static LLVMOptRemarkDebugLoc nDebugLoc(long struct) { return LLVMOptRemarkDebugLoc.create(struct + LLVMOptRemarkEntry.DEBUGLOC); }
    /** Unsafe version of {@link #Hotness}. */
    public static int nHotness(long struct) { return UNSAFE.getInt(null, struct + LLVMOptRemarkEntry.HOTNESS); }
    /** Unsafe version of {@link #NumArgs}. */
    public static int nNumArgs(long struct) { return UNSAFE.getInt(null, struct + LLVMOptRemarkEntry.NUMARGS); }
    /** Unsafe version of {@link #Args}. */
    public static LLVMOptRemarkArg.Buffer nArgs(long struct) { return LLVMOptRemarkArg.create(memGetAddress(struct + LLVMOptRemarkEntry.ARGS), nNumArgs(struct)); }

    // -----------------------------------

    /** An array of {@link LLVMOptRemarkEntry} structs. */
    public static class Buffer extends StructBuffer<LLVMOptRemarkEntry, Buffer> {

        private static final LLVMOptRemarkEntry ELEMENT_FACTORY = LLVMOptRemarkEntry.create(-1L);

        /**
         * Creates a new {@code LLVMOptRemarkEntry.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMOptRemarkEntry#SIZEOF}, and its mark will be undefined.
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
        protected LLVMOptRemarkEntry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link LLVMOptRemarkStringRef} view of the {@code RemarkType} field. */
        public LLVMOptRemarkStringRef RemarkType() { return LLVMOptRemarkEntry.nRemarkType(address()); }
        /** Returns a {@link LLVMOptRemarkStringRef} view of the {@code PassName} field. */
        public LLVMOptRemarkStringRef PassName() { return LLVMOptRemarkEntry.nPassName(address()); }
        /** Returns a {@link LLVMOptRemarkStringRef} view of the {@code RemarkName} field. */
        public LLVMOptRemarkStringRef RemarkName() { return LLVMOptRemarkEntry.nRemarkName(address()); }
        /** Returns a {@link LLVMOptRemarkStringRef} view of the {@code FunctionName} field. */
        public LLVMOptRemarkStringRef FunctionName() { return LLVMOptRemarkEntry.nFunctionName(address()); }
        /** Returns a {@link LLVMOptRemarkDebugLoc} view of the {@code DebugLoc} field. */
        public LLVMOptRemarkDebugLoc DebugLoc() { return LLVMOptRemarkEntry.nDebugLoc(address()); }
        /** Returns the value of the {@code Hotness} field. */
        @NativeType("uint32_t")
        public int Hotness() { return LLVMOptRemarkEntry.nHotness(address()); }
        /** Returns the value of the {@code NumArgs} field. */
        @NativeType("uint32_t")
        public int NumArgs() { return LLVMOptRemarkEntry.nNumArgs(address()); }
        /** Returns a {@link LLVMOptRemarkArg.Buffer} view of the struct array pointed to by the {@code Args} field. */
        @NativeType("LLVMOptRemarkArg *")
        public LLVMOptRemarkArg.Buffer Args() { return LLVMOptRemarkEntry.nArgs(address()); }

    }

}