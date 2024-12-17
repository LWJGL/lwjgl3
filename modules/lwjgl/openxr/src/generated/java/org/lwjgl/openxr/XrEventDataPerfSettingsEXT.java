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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrEventDataPerfSettingsEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrPerfSettingsDomainEXT domain;
 *     XrPerfSettingsSubDomainEXT subDomain;
 *     XrPerfSettingsNotificationLevelEXT fromLevel;
 *     XrPerfSettingsNotificationLevelEXT toLevel;
 * }}</pre>
 */
public class XrEventDataPerfSettingsEXT extends Struct<XrEventDataPerfSettingsEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        DOMAIN,
        SUBDOMAIN,
        FROMLEVEL,
        TOLEVEL;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        DOMAIN = layout.offsetof(2);
        SUBDOMAIN = layout.offsetof(3);
        FROMLEVEL = layout.offsetof(4);
        TOLEVEL = layout.offsetof(5);
    }

    protected XrEventDataPerfSettingsEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataPerfSettingsEXT create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataPerfSettingsEXT(address, container);
    }

    /**
     * Creates a {@code XrEventDataPerfSettingsEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataPerfSettingsEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code domain} field. */
    @NativeType("XrPerfSettingsDomainEXT")
    public int domain() { return ndomain(address()); }
    /** @return the value of the {@code subDomain} field. */
    @NativeType("XrPerfSettingsSubDomainEXT")
    public int subDomain() { return nsubDomain(address()); }
    /** @return the value of the {@code fromLevel} field. */
    @NativeType("XrPerfSettingsNotificationLevelEXT")
    public int fromLevel() { return nfromLevel(address()); }
    /** @return the value of the {@code toLevel} field. */
    @NativeType("XrPerfSettingsNotificationLevelEXT")
    public int toLevel() { return ntoLevel(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataPerfSettingsEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTPerformanceSettings#XR_TYPE_EVENT_DATA_PERF_SETTINGS_EXT TYPE_EVENT_DATA_PERF_SETTINGS_EXT} value to the {@code type} field. */
    public XrEventDataPerfSettingsEXT type$Default() { return type(EXTPerformanceSettings.XR_TYPE_EVENT_DATA_PERF_SETTINGS_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataPerfSettingsEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataPerfSettingsEXT set(
        int type,
        long next
    ) {
        type(type);
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
    public XrEventDataPerfSettingsEXT set(XrEventDataPerfSettingsEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataPerfSettingsEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataPerfSettingsEXT malloc() {
        return new XrEventDataPerfSettingsEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataPerfSettingsEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataPerfSettingsEXT calloc() {
        return new XrEventDataPerfSettingsEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataPerfSettingsEXT} instance allocated with {@link BufferUtils}. */
    public static XrEventDataPerfSettingsEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataPerfSettingsEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataPerfSettingsEXT} instance for the specified memory address. */
    public static XrEventDataPerfSettingsEXT create(long address) {
        return new XrEventDataPerfSettingsEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataPerfSettingsEXT createSafe(long address) {
        return address == NULL ? null : new XrEventDataPerfSettingsEXT(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataPerfSettingsEXT}. */
    public static XrEventDataPerfSettingsEXT create(XrEventDataBaseHeader value) {
        return new XrEventDataPerfSettingsEXT(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataPerfSettingsEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataPerfSettingsEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataPerfSettingsEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataPerfSettingsEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataPerfSettingsEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataPerfSettingsEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataPerfSettingsEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataPerfSettingsEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataPerfSettingsEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataPerfSettingsEXT.Buffer}. */
    public static XrEventDataPerfSettingsEXT.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataPerfSettingsEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataPerfSettingsEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataPerfSettingsEXT malloc(MemoryStack stack) {
        return new XrEventDataPerfSettingsEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataPerfSettingsEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataPerfSettingsEXT calloc(MemoryStack stack) {
        return new XrEventDataPerfSettingsEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataPerfSettingsEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataPerfSettingsEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataPerfSettingsEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataPerfSettingsEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataPerfSettingsEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataPerfSettingsEXT.NEXT); }
    /** Unsafe version of {@link #domain}. */
    public static int ndomain(long struct) { return memGetInt(struct + XrEventDataPerfSettingsEXT.DOMAIN); }
    /** Unsafe version of {@link #subDomain}. */
    public static int nsubDomain(long struct) { return memGetInt(struct + XrEventDataPerfSettingsEXT.SUBDOMAIN); }
    /** Unsafe version of {@link #fromLevel}. */
    public static int nfromLevel(long struct) { return memGetInt(struct + XrEventDataPerfSettingsEXT.FROMLEVEL); }
    /** Unsafe version of {@link #toLevel}. */
    public static int ntoLevel(long struct) { return memGetInt(struct + XrEventDataPerfSettingsEXT.TOLEVEL); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataPerfSettingsEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataPerfSettingsEXT.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataPerfSettingsEXT} structs. */
    public static class Buffer extends StructBuffer<XrEventDataPerfSettingsEXT, Buffer> implements NativeResource {

        private static final XrEventDataPerfSettingsEXT ELEMENT_FACTORY = XrEventDataPerfSettingsEXT.create(-1L);

        /**
         * Creates a new {@code XrEventDataPerfSettingsEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataPerfSettingsEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataPerfSettingsEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataPerfSettingsEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataPerfSettingsEXT.nnext(address()); }
        /** @return the value of the {@code domain} field. */
        @NativeType("XrPerfSettingsDomainEXT")
        public int domain() { return XrEventDataPerfSettingsEXT.ndomain(address()); }
        /** @return the value of the {@code subDomain} field. */
        @NativeType("XrPerfSettingsSubDomainEXT")
        public int subDomain() { return XrEventDataPerfSettingsEXT.nsubDomain(address()); }
        /** @return the value of the {@code fromLevel} field. */
        @NativeType("XrPerfSettingsNotificationLevelEXT")
        public int fromLevel() { return XrEventDataPerfSettingsEXT.nfromLevel(address()); }
        /** @return the value of the {@code toLevel} field. */
        @NativeType("XrPerfSettingsNotificationLevelEXT")
        public int toLevel() { return XrEventDataPerfSettingsEXT.ntoLevel(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataPerfSettingsEXT.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataPerfSettingsEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTPerformanceSettings#XR_TYPE_EVENT_DATA_PERF_SETTINGS_EXT TYPE_EVENT_DATA_PERF_SETTINGS_EXT} value to the {@code type} field. */
        public XrEventDataPerfSettingsEXT.Buffer type$Default() { return type(EXTPerformanceSettings.XR_TYPE_EVENT_DATA_PERF_SETTINGS_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataPerfSettingsEXT.Buffer next(@NativeType("void const *") long value) { XrEventDataPerfSettingsEXT.nnext(address(), value); return this; }

    }

}