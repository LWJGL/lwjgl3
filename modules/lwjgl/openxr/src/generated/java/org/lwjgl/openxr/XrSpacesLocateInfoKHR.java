/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSpacesLocateInfoKHR {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace baseSpace;
 *     XrTime time;
 *     uint32_t spaceCount;
 *     XrSpace const * spaces;
 * }}</pre>
 */
public class XrSpacesLocateInfoKHR extends XrSpacesLocateInfo {

    protected XrSpacesLocateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpacesLocateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new XrSpacesLocateInfoKHR(address, container);
    }

    /**
     * Creates a {@code XrSpacesLocateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpacesLocateInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code type} field. */
    @Override
    public XrSpacesLocateInfoKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR11#XR_TYPE_SPACES_LOCATE_INFO TYPE_SPACES_LOCATE_INFO} value to the {@code type} field. */
    @Override
    public XrSpacesLocateInfoKHR type$Default() { return type(XR11.XR_TYPE_SPACES_LOCATE_INFO); }
    /** Sets the specified value to the {@code next} field. */
    @Override
    public XrSpacesLocateInfoKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code baseSpace} field. */
    @Override
    public XrSpacesLocateInfoKHR baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    @Override
    public XrSpacesLocateInfoKHR time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code spaces} field. */
    @Override
    public XrSpacesLocateInfoKHR spaces(@NativeType("XrSpace const *") PointerBuffer value) { nspaces(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public XrSpacesLocateInfoKHR set(
        int type,
        long next,
        XrSpace baseSpace,
        long time,
        PointerBuffer spaces
    ) {
        type(type);
        next(next);
        baseSpace(baseSpace);
        time(time);
        spaces(spaces);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpacesLocateInfoKHR set(XrSpacesLocateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpacesLocateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpacesLocateInfoKHR malloc() {
        return new XrSpacesLocateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpacesLocateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpacesLocateInfoKHR calloc() {
        return new XrSpacesLocateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpacesLocateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static XrSpacesLocateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpacesLocateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrSpacesLocateInfoKHR} instance for the specified memory address. */
    public static XrSpacesLocateInfoKHR create(long address) {
        return new XrSpacesLocateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpacesLocateInfoKHR createSafe(long address) {
        return address == NULL ? null : new XrSpacesLocateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link XrSpacesLocateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpacesLocateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpacesLocateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpacesLocateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpacesLocateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpacesLocateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpacesLocateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpacesLocateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpacesLocateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpacesLocateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpacesLocateInfoKHR malloc(MemoryStack stack) {
        return new XrSpacesLocateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpacesLocateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpacesLocateInfoKHR calloc(MemoryStack stack) {
        return new XrSpacesLocateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpacesLocateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpacesLocateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpacesLocateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpacesLocateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link XrSpacesLocateInfoKHR} structs. */
    public static class Buffer extends XrSpacesLocateInfo.Buffer {

        private static final XrSpacesLocateInfoKHR ELEMENT_FACTORY = XrSpacesLocateInfoKHR.create(-1L);

        /**
         * Creates a new {@code XrSpacesLocateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpacesLocateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
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
        protected XrSpacesLocateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code type} field. */
        @Override
        public XrSpacesLocateInfoKHR.Buffer type(@NativeType("XrStructureType") int value) { XrSpacesLocateInfoKHR.ntype(address(), value); return this; }
        /** Sets the {@link XR11#XR_TYPE_SPACES_LOCATE_INFO TYPE_SPACES_LOCATE_INFO} value to the {@code type} field. */
        @Override
        public XrSpacesLocateInfoKHR.Buffer type$Default() { return type(XR11.XR_TYPE_SPACES_LOCATE_INFO); }
        /** Sets the specified value to the {@code next} field. */
        @Override
        public XrSpacesLocateInfoKHR.Buffer next(@NativeType("void const *") long value) { XrSpacesLocateInfoKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code baseSpace} field. */
        @Override
        public XrSpacesLocateInfoKHR.Buffer baseSpace(XrSpace value) { XrSpacesLocateInfoKHR.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        @Override
        public XrSpacesLocateInfoKHR.Buffer time(@NativeType("XrTime") long value) { XrSpacesLocateInfoKHR.ntime(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code spaces} field. */
        @Override
        public XrSpacesLocateInfoKHR.Buffer spaces(@NativeType("XrSpace const *") PointerBuffer value) { XrSpacesLocateInfoKHR.nspaces(address(), value); return this; }

    }

}