/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * XrEventDataPerfSettingsEXT.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTPerformanceSettings XR_EXT_performance_settings} extension <b>must</b> be enabled prior to using {@link XrEventDataPerfSettingsEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTPerformanceSettings#XR_TYPE_EVENT_DATA_PERF_SETTINGS_EXT TYPE_EVENT_DATA_PERF_SETTINGS_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code domain} <b>must</b> be a valid {@code XrPerfSettingsDomainEXT} value</li>
 * <li>{@code subDomain} <b>must</b> be a valid {@code XrPerfSettingsSubDomainEXT} value</li>
 * <li>{@code fromLevel} <b>must</b> be a valid {@code XrPerfSettingsNotificationLevelEXT} value</li>
 * <li>{@code toLevel} <b>must</b> be a valid {@code XrPerfSettingsNotificationLevelEXT} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataPerfSettingsEXT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrPerfSettingsDomainEXT {@link #domain};
 *     XrPerfSettingsSubDomainEXT {@link #subDomain};
 *     XrPerfSettingsNotificationLevelEXT {@link #fromLevel};
 *     XrPerfSettingsNotificationLevelEXT {@link #toLevel};
 * }</code></pre>
 */
public class XrEventDataPerfSettingsEXT extends Struct implements NativeResource {

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

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** : processing domain in which a threshold has been crossed */
    @NativeType("XrPerfSettingsDomainEXT")
    public int domain() { return ndomain(address()); }
    /** : system area in which a threshold has been crossed */
    @NativeType("XrPerfSettingsSubDomainEXT")
    public int subDomain() { return nsubDomain(address()); }
    /** : enumerated notification level which has been exited */
    @NativeType("XrPerfSettingsNotificationLevelEXT")
    public int fromLevel() { return nfromLevel(address()); }
    /** : enumerated notification level which has been entered */
    @NativeType("XrPerfSettingsNotificationLevelEXT")
    public int toLevel() { return ntoLevel(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataPerfSettingsEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTPerformanceSettings#XR_TYPE_EVENT_DATA_PERF_SETTINGS_EXT TYPE_EVENT_DATA_PERF_SETTINGS_EXT} value to the {@link #type} field. */
    public XrEventDataPerfSettingsEXT type$Default() { return type(EXTPerformanceSettings.XR_TYPE_EVENT_DATA_PERF_SETTINGS_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataPerfSettingsEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #domain} field. */
    public XrEventDataPerfSettingsEXT domain(@NativeType("XrPerfSettingsDomainEXT") int value) { ndomain(address(), value); return this; }
    /** Sets the specified value to the {@link #subDomain} field. */
    public XrEventDataPerfSettingsEXT subDomain(@NativeType("XrPerfSettingsSubDomainEXT") int value) { nsubDomain(address(), value); return this; }
    /** Sets the specified value to the {@link #fromLevel} field. */
    public XrEventDataPerfSettingsEXT fromLevel(@NativeType("XrPerfSettingsNotificationLevelEXT") int value) { nfromLevel(address(), value); return this; }
    /** Sets the specified value to the {@link #toLevel} field. */
    public XrEventDataPerfSettingsEXT toLevel(@NativeType("XrPerfSettingsNotificationLevelEXT") int value) { ntoLevel(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataPerfSettingsEXT set(
        int type,
        long next,
        int domain,
        int subDomain,
        int fromLevel,
        int toLevel
    ) {
        type(type);
        next(next);
        domain(domain);
        subDomain(subDomain);
        fromLevel(fromLevel);
        toLevel(toLevel);

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
        return wrap(XrEventDataPerfSettingsEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrEventDataPerfSettingsEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataPerfSettingsEXT calloc() {
        return wrap(XrEventDataPerfSettingsEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrEventDataPerfSettingsEXT} instance allocated with {@link BufferUtils}. */
    public static XrEventDataPerfSettingsEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrEventDataPerfSettingsEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataPerfSettingsEXT} instance for the specified memory address. */
    public static XrEventDataPerfSettingsEXT create(long address) {
        return wrap(XrEventDataPerfSettingsEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataPerfSettingsEXT createSafe(long address) {
        return address == NULL ? null : wrap(XrEventDataPerfSettingsEXT.class, address);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataPerfSettingsEXT}. */
    public static XrEventDataPerfSettingsEXT create(XrEventDataBaseHeader value) {
        return wrap(XrEventDataPerfSettingsEXT.class, value);
    }

    /**
     * Returns a new {@link XrEventDataPerfSettingsEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataPerfSettingsEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataPerfSettingsEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataPerfSettingsEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataPerfSettingsEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataPerfSettingsEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrEventDataPerfSettingsEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataPerfSettingsEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataPerfSettingsEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataPerfSettingsEXT.Buffer}. */
    public static XrEventDataPerfSettingsEXT.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrEventDataPerfSettingsEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataPerfSettingsEXT malloc(MemoryStack stack) {
        return wrap(XrEventDataPerfSettingsEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrEventDataPerfSettingsEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataPerfSettingsEXT calloc(MemoryStack stack) {
        return wrap(XrEventDataPerfSettingsEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrEventDataPerfSettingsEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataPerfSettingsEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataPerfSettingsEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataPerfSettingsEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataPerfSettingsEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataPerfSettingsEXT.NEXT); }
    /** Unsafe version of {@link #domain}. */
    public static int ndomain(long struct) { return UNSAFE.getInt(null, struct + XrEventDataPerfSettingsEXT.DOMAIN); }
    /** Unsafe version of {@link #subDomain}. */
    public static int nsubDomain(long struct) { return UNSAFE.getInt(null, struct + XrEventDataPerfSettingsEXT.SUBDOMAIN); }
    /** Unsafe version of {@link #fromLevel}. */
    public static int nfromLevel(long struct) { return UNSAFE.getInt(null, struct + XrEventDataPerfSettingsEXT.FROMLEVEL); }
    /** Unsafe version of {@link #toLevel}. */
    public static int ntoLevel(long struct) { return UNSAFE.getInt(null, struct + XrEventDataPerfSettingsEXT.TOLEVEL); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataPerfSettingsEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataPerfSettingsEXT.NEXT, value); }
    /** Unsafe version of {@link #domain(int) domain}. */
    public static void ndomain(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataPerfSettingsEXT.DOMAIN, value); }
    /** Unsafe version of {@link #subDomain(int) subDomain}. */
    public static void nsubDomain(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataPerfSettingsEXT.SUBDOMAIN, value); }
    /** Unsafe version of {@link #fromLevel(int) fromLevel}. */
    public static void nfromLevel(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataPerfSettingsEXT.FROMLEVEL, value); }
    /** Unsafe version of {@link #toLevel(int) toLevel}. */
    public static void ntoLevel(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataPerfSettingsEXT.TOLEVEL, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataPerfSettingsEXT} structs. */
    public static class Buffer extends StructBuffer<XrEventDataPerfSettingsEXT, Buffer> implements NativeResource {

        private static final XrEventDataPerfSettingsEXT ELEMENT_FACTORY = XrEventDataPerfSettingsEXT.create(-1L);

        /**
         * Creates a new {@code XrEventDataPerfSettingsEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataPerfSettingsEXT#SIZEOF}, and its mark will be undefined.
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
        protected XrEventDataPerfSettingsEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataPerfSettingsEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataPerfSettingsEXT.ntype(address()); }
        /** @return the value of the {@link XrEventDataPerfSettingsEXT#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataPerfSettingsEXT.nnext(address()); }
        /** @return the value of the {@link XrEventDataPerfSettingsEXT#domain} field. */
        @NativeType("XrPerfSettingsDomainEXT")
        public int domain() { return XrEventDataPerfSettingsEXT.ndomain(address()); }
        /** @return the value of the {@link XrEventDataPerfSettingsEXT#subDomain} field. */
        @NativeType("XrPerfSettingsSubDomainEXT")
        public int subDomain() { return XrEventDataPerfSettingsEXT.nsubDomain(address()); }
        /** @return the value of the {@link XrEventDataPerfSettingsEXT#fromLevel} field. */
        @NativeType("XrPerfSettingsNotificationLevelEXT")
        public int fromLevel() { return XrEventDataPerfSettingsEXT.nfromLevel(address()); }
        /** @return the value of the {@link XrEventDataPerfSettingsEXT#toLevel} field. */
        @NativeType("XrPerfSettingsNotificationLevelEXT")
        public int toLevel() { return XrEventDataPerfSettingsEXT.ntoLevel(address()); }

        /** Sets the specified value to the {@link XrEventDataPerfSettingsEXT#type} field. */
        public XrEventDataPerfSettingsEXT.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataPerfSettingsEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTPerformanceSettings#XR_TYPE_EVENT_DATA_PERF_SETTINGS_EXT TYPE_EVENT_DATA_PERF_SETTINGS_EXT} value to the {@link XrEventDataPerfSettingsEXT#type} field. */
        public XrEventDataPerfSettingsEXT.Buffer type$Default() { return type(EXTPerformanceSettings.XR_TYPE_EVENT_DATA_PERF_SETTINGS_EXT); }
        /** Sets the specified value to the {@link XrEventDataPerfSettingsEXT#next} field. */
        public XrEventDataPerfSettingsEXT.Buffer next(@NativeType("void const *") long value) { XrEventDataPerfSettingsEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataPerfSettingsEXT#domain} field. */
        public XrEventDataPerfSettingsEXT.Buffer domain(@NativeType("XrPerfSettingsDomainEXT") int value) { XrEventDataPerfSettingsEXT.ndomain(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataPerfSettingsEXT#subDomain} field. */
        public XrEventDataPerfSettingsEXT.Buffer subDomain(@NativeType("XrPerfSettingsSubDomainEXT") int value) { XrEventDataPerfSettingsEXT.nsubDomain(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataPerfSettingsEXT#fromLevel} field. */
        public XrEventDataPerfSettingsEXT.Buffer fromLevel(@NativeType("XrPerfSettingsNotificationLevelEXT") int value) { XrEventDataPerfSettingsEXT.nfromLevel(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataPerfSettingsEXT#toLevel} field. */
        public XrEventDataPerfSettingsEXT.Buffer toLevel(@NativeType("XrPerfSettingsNotificationLevelEXT") int value) { XrEventDataPerfSettingsEXT.ntoLevel(address(), value); return this; }

    }

}