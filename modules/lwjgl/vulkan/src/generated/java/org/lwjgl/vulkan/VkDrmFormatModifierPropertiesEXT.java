/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct VkDrmFormatModifierPropertiesEXT {
 *     uint64_t drmFormatModifier;
 *     uint32_t drmFormatModifierPlaneCount;
 *     VkFormatFeatureFlags drmFormatModifierTilingFeatures;
 * }}</pre>
 */
public class VkDrmFormatModifierPropertiesEXT extends Struct<VkDrmFormatModifierPropertiesEXT> {

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
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DRMFORMATMODIFIER = layout.offsetof(0);
        DRMFORMATMODIFIERPLANECOUNT = layout.offsetof(1);
        DRMFORMATMODIFIERTILINGFEATURES = layout.offsetof(2);
    }

    protected VkDrmFormatModifierPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDrmFormatModifierPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDrmFormatModifierPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkDrmFormatModifierPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDrmFormatModifierPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code drmFormatModifier} field. */
    @NativeType("uint64_t")
    public long drmFormatModifier() { return ndrmFormatModifier(address()); }
    /** @return the value of the {@code drmFormatModifierPlaneCount} field. */
    @NativeType("uint32_t")
    public int drmFormatModifierPlaneCount() { return ndrmFormatModifierPlaneCount(address()); }
    /** @return the value of the {@code drmFormatModifierTilingFeatures} field. */
    @NativeType("VkFormatFeatureFlags")
    public int drmFormatModifierTilingFeatures() { return ndrmFormatModifierTilingFeatures(address()); }

    // -----------------------------------

    /** Returns a new {@code VkDrmFormatModifierPropertiesEXT} instance for the specified memory address. */
    public static VkDrmFormatModifierPropertiesEXT create(long address) {
        return new VkDrmFormatModifierPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDrmFormatModifierPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkDrmFormatModifierPropertiesEXT(address, null);
    }

    /**
     * Create a {@link VkDrmFormatModifierPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDrmFormatModifierPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #drmFormatModifier}. */
    public static long ndrmFormatModifier(long struct) { return memGetLong(struct + VkDrmFormatModifierPropertiesEXT.DRMFORMATMODIFIER); }
    /** Unsafe version of {@link #drmFormatModifierPlaneCount}. */
    public static int ndrmFormatModifierPlaneCount(long struct) { return memGetInt(struct + VkDrmFormatModifierPropertiesEXT.DRMFORMATMODIFIERPLANECOUNT); }
    /** Unsafe version of {@link #drmFormatModifierTilingFeatures}. */
    public static int ndrmFormatModifierTilingFeatures(long struct) { return memGetInt(struct + VkDrmFormatModifierPropertiesEXT.DRMFORMATMODIFIERTILINGFEATURES); }

    // -----------------------------------

    /** An array of {@link VkDrmFormatModifierPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkDrmFormatModifierPropertiesEXT, Buffer> {

        private static final VkDrmFormatModifierPropertiesEXT ELEMENT_FACTORY = VkDrmFormatModifierPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkDrmFormatModifierPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDrmFormatModifierPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDrmFormatModifierPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code drmFormatModifier} field. */
        @NativeType("uint64_t")
        public long drmFormatModifier() { return VkDrmFormatModifierPropertiesEXT.ndrmFormatModifier(address()); }
        /** @return the value of the {@code drmFormatModifierPlaneCount} field. */
        @NativeType("uint32_t")
        public int drmFormatModifierPlaneCount() { return VkDrmFormatModifierPropertiesEXT.ndrmFormatModifierPlaneCount(address()); }
        /** @return the value of the {@code drmFormatModifierTilingFeatures} field. */
        @NativeType("VkFormatFeatureFlags")
        public int drmFormatModifierTilingFeatures() { return VkDrmFormatModifierPropertiesEXT.ndrmFormatModifierTilingFeatures(address()); }

    }

}