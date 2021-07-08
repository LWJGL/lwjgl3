/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure specifying external memory handle type capabilities.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code compatibleHandleTypes} <b>must</b> include at least {@code handleType}. Inclusion of a handle type in {@code compatibleHandleTypes} does not imply the values returned in {@link VkImageFormatProperties2} will be the same when {@link VkPhysicalDeviceExternalImageFormatInfo}{@code ::handleType} is set to that type. The application is responsible for querying the capabilities of all handle types intended for concurrent use in a single image and intersecting them to obtain the compatible set of capabilities.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExternalBufferProperties}, {@link VkExternalImageFormatProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExternalMemoryProperties {
 *     VkExternalMemoryFeatureFlags {@link #externalMemoryFeatures};
 *     VkExternalMemoryHandleTypeFlags {@link #exportFromImportedHandleTypes};
 *     VkExternalMemoryHandleTypeFlags {@link #compatibleHandleTypes};
 * }</code></pre>
 */
public class VkExternalMemoryProperties extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EXTERNALMEMORYFEATURES,
        EXPORTFROMIMPORTEDHANDLETYPES,
        COMPATIBLEHANDLETYPES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EXTERNALMEMORYFEATURES = layout.offsetof(0);
        EXPORTFROMIMPORTEDHANDLETYPES = layout.offsetof(1);
        COMPATIBLEHANDLETYPES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkExternalMemoryProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalMemoryProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a bitmask of {@code VkExternalMemoryFeatureFlagBits} specifying the features of {@code handleType}. */
    @NativeType("VkExternalMemoryFeatureFlags")
    public int externalMemoryFeatures() { return nexternalMemoryFeatures(address()); }
    /** a bitmask of {@code VkExternalMemoryHandleTypeFlagBits} specifying which types of imported handle {@code handleType} <b>can</b> be exported from. */
    @NativeType("VkExternalMemoryHandleTypeFlags")
    public int exportFromImportedHandleTypes() { return nexportFromImportedHandleTypes(address()); }
    /** a bitmask of {@code VkExternalMemoryHandleTypeFlagBits} specifying handle types which <b>can</b> be specified at the same time as {@code handleType} when creating an image compatible with external memory. */
    @NativeType("VkExternalMemoryHandleTypeFlags")
    public int compatibleHandleTypes() { return ncompatibleHandleTypes(address()); }

    // -----------------------------------

    /** Returns a new {@code VkExternalMemoryProperties} instance for the specified memory address. */
    public static VkExternalMemoryProperties create(long address) {
        return wrap(VkExternalMemoryProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalMemoryProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkExternalMemoryProperties.class, address);
    }

    /**
     * Create a {@link VkExternalMemoryProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalMemoryProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #externalMemoryFeatures}. */
    public static int nexternalMemoryFeatures(long struct) { return UNSAFE.getInt(null, struct + VkExternalMemoryProperties.EXTERNALMEMORYFEATURES); }
    /** Unsafe version of {@link #exportFromImportedHandleTypes}. */
    public static int nexportFromImportedHandleTypes(long struct) { return UNSAFE.getInt(null, struct + VkExternalMemoryProperties.EXPORTFROMIMPORTEDHANDLETYPES); }
    /** Unsafe version of {@link #compatibleHandleTypes}. */
    public static int ncompatibleHandleTypes(long struct) { return UNSAFE.getInt(null, struct + VkExternalMemoryProperties.COMPATIBLEHANDLETYPES); }

    // -----------------------------------

    /** An array of {@link VkExternalMemoryProperties} structs. */
    public static class Buffer extends StructBuffer<VkExternalMemoryProperties, Buffer> {

        private static final VkExternalMemoryProperties ELEMENT_FACTORY = VkExternalMemoryProperties.create(-1L);

        /**
         * Creates a new {@code VkExternalMemoryProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalMemoryProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkExternalMemoryProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExternalMemoryProperties#externalMemoryFeatures} field. */
        @NativeType("VkExternalMemoryFeatureFlags")
        public int externalMemoryFeatures() { return VkExternalMemoryProperties.nexternalMemoryFeatures(address()); }
        /** @return the value of the {@link VkExternalMemoryProperties#exportFromImportedHandleTypes} field. */
        @NativeType("VkExternalMemoryHandleTypeFlags")
        public int exportFromImportedHandleTypes() { return VkExternalMemoryProperties.nexportFromImportedHandleTypes(address()); }
        /** @return the value of the {@link VkExternalMemoryProperties#compatibleHandleTypes} field. */
        @NativeType("VkExternalMemoryHandleTypeFlags")
        public int compatibleHandleTypes() { return VkExternalMemoryProperties.ncompatibleHandleTypes(address()); }

    }

}