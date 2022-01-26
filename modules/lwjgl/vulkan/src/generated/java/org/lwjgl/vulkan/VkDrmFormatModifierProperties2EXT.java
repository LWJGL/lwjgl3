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
 * Structure specifying properties of a format when combined with a DRM format modifier.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDrmFormatModifierPropertiesList2EXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDrmFormatModifierProperties2EXT {
 *     uint64_t {@link #drmFormatModifier};
 *     uint32_t {@link #drmFormatModifierPlaneCount};
 *     VkFormatFeatureFlags2 {@link #drmFormatModifierTilingFeatures};
 * }</code></pre>
 */
public class VkDrmFormatModifierProperties2EXT extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DRMFORMATMODIFIER,
        DRMFORMATMODIFIERPLANECOUNT,
        DRMFORMATMODIFIERTILINGFEATURES;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DRMFORMATMODIFIER = layout.offsetof(0);
        DRMFORMATMODIFIERPLANECOUNT = layout.offsetof(1);
        DRMFORMATMODIFIERTILINGFEATURES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkDrmFormatModifierProperties2EXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDrmFormatModifierProperties2EXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a <em>Linux DRM format modifier</em>. */
    @NativeType("uint64_t")
    public long drmFormatModifier() { return ndrmFormatModifier(address()); }
    /** the number of <em>memory planes</em> in any image created with {@code format} and {@code drmFormatModifier}. An image’s <em>memory planecount</em> is distinct from its <em>format planecount</em>, as explained below. */
    @NativeType("uint32_t")
    public int drmFormatModifierPlaneCount() { return ndrmFormatModifierPlaneCount(address()); }
    /** a bitmask of {@code VkFormatFeatureFlagBits2} that are supported by any image created with {@code format} and {@code drmFormatModifier}. */
    @NativeType("VkFormatFeatureFlags2")
    public long drmFormatModifierTilingFeatures() { return ndrmFormatModifierTilingFeatures(address()); }

    // -----------------------------------

    /** Returns a new {@code VkDrmFormatModifierProperties2EXT} instance for the specified memory address. */
    public static VkDrmFormatModifierProperties2EXT create(long address) {
        return wrap(VkDrmFormatModifierProperties2EXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDrmFormatModifierProperties2EXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDrmFormatModifierProperties2EXT.class, address);
    }

    /**
     * Create a {@link VkDrmFormatModifierProperties2EXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierProperties2EXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDrmFormatModifierProperties2EXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #drmFormatModifier}. */
    public static long ndrmFormatModifier(long struct) { return UNSAFE.getLong(null, struct + VkDrmFormatModifierProperties2EXT.DRMFORMATMODIFIER); }
    /** Unsafe version of {@link #drmFormatModifierPlaneCount}. */
    public static int ndrmFormatModifierPlaneCount(long struct) { return UNSAFE.getInt(null, struct + VkDrmFormatModifierProperties2EXT.DRMFORMATMODIFIERPLANECOUNT); }
    /** Unsafe version of {@link #drmFormatModifierTilingFeatures}. */
    public static long ndrmFormatModifierTilingFeatures(long struct) { return UNSAFE.getLong(null, struct + VkDrmFormatModifierProperties2EXT.DRMFORMATMODIFIERTILINGFEATURES); }

    // -----------------------------------

    /** An array of {@link VkDrmFormatModifierProperties2EXT} structs. */
    public static class Buffer extends StructBuffer<VkDrmFormatModifierProperties2EXT, Buffer> {

        private static final VkDrmFormatModifierProperties2EXT ELEMENT_FACTORY = VkDrmFormatModifierProperties2EXT.create(-1L);

        /**
         * Creates a new {@code VkDrmFormatModifierProperties2EXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDrmFormatModifierProperties2EXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDrmFormatModifierProperties2EXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDrmFormatModifierProperties2EXT#drmFormatModifier} field. */
        @NativeType("uint64_t")
        public long drmFormatModifier() { return VkDrmFormatModifierProperties2EXT.ndrmFormatModifier(address()); }
        /** @return the value of the {@link VkDrmFormatModifierProperties2EXT#drmFormatModifierPlaneCount} field. */
        @NativeType("uint32_t")
        public int drmFormatModifierPlaneCount() { return VkDrmFormatModifierProperties2EXT.ndrmFormatModifierPlaneCount(address()); }
        /** @return the value of the {@link VkDrmFormatModifierProperties2EXT#drmFormatModifierTilingFeatures} field. */
        @NativeType("VkFormatFeatureFlags2")
        public long drmFormatModifierTilingFeatures() { return VkDrmFormatModifierProperties2EXT.ndrmFormatModifierTilingFeatures(address()); }

    }

}