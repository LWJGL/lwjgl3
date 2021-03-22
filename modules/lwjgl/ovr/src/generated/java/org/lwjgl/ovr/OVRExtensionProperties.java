/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.ovr.OVR.OVR_MAX_EXTENSION_NAME_SIZE;

/**
 * Describes the properties of an API extension.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrExtensionProperties {
 *     int {@link #extensionId};
 *     char extensionName[OVR_MAX_EXTENSION_NAME_SIZE];
 *     uint32_t {@link #extensionVersion};
 * }</code></pre>
 */
@NativeType("struct ovrExtensionProperties")
public class OVRExtensionProperties extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EXTENSIONID,
        EXTENSIONNAME,
        EXTENSIONVERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __array(1, OVR_MAX_EXTENSION_NAME_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EXTENSIONID = layout.offsetof(0);
        EXTENSIONNAME = layout.offsetof(1);
        EXTENSIONVERSION = layout.offsetof(2);
    }

    /**
     * Creates a {@code OVRExtensionProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRExtensionProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** One of enum {@code ovrExtensions} or a dynamic value. */
    public int extensionId() { return nextensionId(address()); }
    /** @return a {@link ByteBuffer} view of the {@code extensionName} field. */
    @NativeType("char[OVR_MAX_EXTENSION_NAME_SIZE]")
    public ByteBuffer extensionName() { return nextensionName(address()); }
    /** @return the null-terminated string stored in the {@code extensionName} field. */
    @NativeType("char[OVR_MAX_EXTENSION_NAME_SIZE]")
    public String extensionNameString() { return nextensionNameString(address()); }
    /** OpenXR-like version. Version compatibility is identified by the extension documentation. */
    @NativeType("uint32_t")
    public int extensionVersion() { return nextensionVersion(address()); }

    // -----------------------------------

    /** Returns a new {@code OVRExtensionProperties} instance for the specified memory address. */
    public static OVRExtensionProperties create(long address) {
        return wrap(OVRExtensionProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRExtensionProperties createSafe(long address) {
        return address == NULL ? null : wrap(OVRExtensionProperties.class, address);
    }

    /**
     * Create a {@link OVRExtensionProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRExtensionProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRExtensionProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #extensionId}. */
    public static int nextensionId(long struct) { return UNSAFE.getInt(null, struct + OVRExtensionProperties.EXTENSIONID); }
    /** Unsafe version of {@link #extensionName}. */
    public static ByteBuffer nextensionName(long struct) { return memByteBuffer(struct + OVRExtensionProperties.EXTENSIONNAME, OVR_MAX_EXTENSION_NAME_SIZE); }
    /** Unsafe version of {@link #extensionNameString}. */
    public static String nextensionNameString(long struct) { return memASCII(struct + OVRExtensionProperties.EXTENSIONNAME); }
    /** Unsafe version of {@link #extensionVersion}. */
    public static int nextensionVersion(long struct) { return UNSAFE.getInt(null, struct + OVRExtensionProperties.EXTENSIONVERSION); }

    // -----------------------------------

    /** An array of {@link OVRExtensionProperties} structs. */
    public static class Buffer extends StructBuffer<OVRExtensionProperties, Buffer> {

        private static final OVRExtensionProperties ELEMENT_FACTORY = OVRExtensionProperties.create(-1L);

        /**
         * Creates a new {@code OVRExtensionProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRExtensionProperties#SIZEOF}, and its mark will be undefined.
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
        protected OVRExtensionProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link OVRExtensionProperties#extensionId} field. */
        public int extensionId() { return OVRExtensionProperties.nextensionId(address()); }
        /** @return a {@link ByteBuffer} view of the {@code extensionName} field. */
        @NativeType("char[OVR_MAX_EXTENSION_NAME_SIZE]")
        public ByteBuffer extensionName() { return OVRExtensionProperties.nextensionName(address()); }
        /** @return the null-terminated string stored in the {@code extensionName} field. */
        @NativeType("char[OVR_MAX_EXTENSION_NAME_SIZE]")
        public String extensionNameString() { return OVRExtensionProperties.nextensionNameString(address()); }
        /** @return the value of the {@link OVRExtensionProperties#extensionVersion} field. */
        @NativeType("uint32_t")
        public int extensionVersion() { return OVRExtensionProperties.nextensionVersion(address()); }

    }

}