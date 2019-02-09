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
 * DebugLoc containing File, Line and Column.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code SourceFile} &ndash; file:</li>
 * <li>{@code SourceLineNumber} &ndash; line:</li>
 * <li>{@code SourceColumnNumber} &ndash; column:</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LLVMOptRemarkDebugLoc {
 *     {@link LLVMOptRemarkStringRef LLVMOptRemarkStringRef} SourceFile;
 *     uint32_t SourceLineNumber;
 *     uint32_t SourceColumnNumber;
 * }</code></pre>
 */
public class LLVMOptRemarkDebugLoc extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SOURCEFILE,
        SOURCELINENUMBER,
        SOURCECOLUMNNUMBER;

    static {
        Layout layout = __struct(
            __member(LLVMOptRemarkStringRef.SIZEOF, LLVMOptRemarkStringRef.ALIGNOF),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SOURCEFILE = layout.offsetof(0);
        SOURCELINENUMBER = layout.offsetof(1);
        SOURCECOLUMNNUMBER = layout.offsetof(2);
    }

    /**
     * Creates a {@code LLVMOptRemarkDebugLoc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LLVMOptRemarkDebugLoc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link LLVMOptRemarkStringRef} view of the {@code SourceFile} field. */
    public LLVMOptRemarkStringRef SourceFile() { return nSourceFile(address()); }
    /** Returns the value of the {@code SourceLineNumber} field. */
    @NativeType("uint32_t")
    public int SourceLineNumber() { return nSourceLineNumber(address()); }
    /** Returns the value of the {@code SourceColumnNumber} field. */
    @NativeType("uint32_t")
    public int SourceColumnNumber() { return nSourceColumnNumber(address()); }

    // -----------------------------------

    /** Returns a new {@code LLVMOptRemarkDebugLoc} instance for the specified memory address. */
    public static LLVMOptRemarkDebugLoc create(long address) {
        return wrap(LLVMOptRemarkDebugLoc.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOptRemarkDebugLoc createSafe(long address) {
        return address == NULL ? null : wrap(LLVMOptRemarkDebugLoc.class, address);
    }

    /**
     * Create a {@link LLVMOptRemarkDebugLoc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMOptRemarkDebugLoc.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOptRemarkDebugLoc.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #SourceFile}. */
    public static LLVMOptRemarkStringRef nSourceFile(long struct) { return LLVMOptRemarkStringRef.create(struct + LLVMOptRemarkDebugLoc.SOURCEFILE); }
    /** Unsafe version of {@link #SourceLineNumber}. */
    public static int nSourceLineNumber(long struct) { return UNSAFE.getInt(null, struct + LLVMOptRemarkDebugLoc.SOURCELINENUMBER); }
    /** Unsafe version of {@link #SourceColumnNumber}. */
    public static int nSourceColumnNumber(long struct) { return UNSAFE.getInt(null, struct + LLVMOptRemarkDebugLoc.SOURCECOLUMNNUMBER); }

    // -----------------------------------

    /** An array of {@link LLVMOptRemarkDebugLoc} structs. */
    public static class Buffer extends StructBuffer<LLVMOptRemarkDebugLoc, Buffer> {

        private static final LLVMOptRemarkDebugLoc ELEMENT_FACTORY = LLVMOptRemarkDebugLoc.create(-1L);

        /**
         * Creates a new {@code LLVMOptRemarkDebugLoc.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMOptRemarkDebugLoc#SIZEOF}, and its mark will be undefined.
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
        protected LLVMOptRemarkDebugLoc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link LLVMOptRemarkStringRef} view of the {@code SourceFile} field. */
        public LLVMOptRemarkStringRef SourceFile() { return LLVMOptRemarkDebugLoc.nSourceFile(address()); }
        /** Returns the value of the {@code SourceLineNumber} field. */
        @NativeType("uint32_t")
        public int SourceLineNumber() { return LLVMOptRemarkDebugLoc.nSourceLineNumber(address()); }
        /** Returns the value of the {@code SourceColumnNumber} field. */
        @NativeType("uint32_t")
        public int SourceColumnNumber() { return LLVMOptRemarkDebugLoc.nSourceColumnNumber(address()); }

    }

}