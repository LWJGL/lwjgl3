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
 * struct VkDrmFormatModifierProperties2EXT {
 *     uint64_t drmFormatModifier;
 *     uint32_t drmFormatModifierPlaneCount;
 *     VkFormatFeatureFlags2 drmFormatModifierTilingFeatures;
 * }}</pre>
 */
public class VkDrmFormatModifierProperties2EXT extends Struct<VkDrmFormatModifierProperties2EXT> {

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

    protected VkDrmFormatModifierProperties2EXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDrmFormatModifierProperties2EXT create(long address, @Nullable ByteBuffer container) {
        return new VkDrmFormatModifierProperties2EXT(address, container);
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

    /** @return the value of the {@code drmFormatModifier} field. */
    @NativeType("uint64_t")
    public long drmFormatModifier() { return ndrmFormatModifier(address()); }
    /** @return the value of the {@code drmFormatModifierPlaneCount} field. */
    @NativeType("uint32_t")
    public int drmFormatModifierPlaneCount() { return ndrmFormatModifierPlaneCount(address()); }
    /** @return the value of the {@code drmFormatModifierTilingFeatures} field. */
    @NativeType("VkFormatFeatureFlags2")
    public long drmFormatModifierTilingFeatures() { return ndrmFormatModifierTilingFeatures(address()); }

    // -----------------------------------

    /** Returns a new {@code VkDrmFormatModifierProperties2EXT} instance for the specified memory address. */
    public static VkDrmFormatModifierProperties2EXT create(long address) {
        return new VkDrmFormatModifierProperties2EXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDrmFormatModifierProperties2EXT createSafe(long address) {
        return address == NULL ? null : new VkDrmFormatModifierProperties2EXT(address, null);
    }

    /**
     * Create a {@link VkDrmFormatModifierProperties2EXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierProperties2EXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDrmFormatModifierProperties2EXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #drmFormatModifier}. */
    public static long ndrmFormatModifier(long struct) { return memGetLong(struct + VkDrmFormatModifierProperties2EXT.DRMFORMATMODIFIER); }
    /** Unsafe version of {@link #drmFormatModifierPlaneCount}. */
    public static int ndrmFormatModifierPlaneCount(long struct) { return memGetInt(struct + VkDrmFormatModifierProperties2EXT.DRMFORMATMODIFIERPLANECOUNT); }
    /** Unsafe version of {@link #drmFormatModifierTilingFeatures}. */
    public static long ndrmFormatModifierTilingFeatures(long struct) { return memGetLong(struct + VkDrmFormatModifierProperties2EXT.DRMFORMATMODIFIERTILINGFEATURES); }

    // -----------------------------------

    /** An array of {@link VkDrmFormatModifierProperties2EXT} structs. */
    public static class Buffer extends StructBuffer<VkDrmFormatModifierProperties2EXT, Buffer> {

        private static final VkDrmFormatModifierProperties2EXT ELEMENT_FACTORY = VkDrmFormatModifierProperties2EXT.create(-1L);

        /**
         * Creates a new {@code VkDrmFormatModifierProperties2EXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDrmFormatModifierProperties2EXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDrmFormatModifierProperties2EXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code drmFormatModifier} field. */
        @NativeType("uint64_t")
        public long drmFormatModifier() { return VkDrmFormatModifierProperties2EXT.ndrmFormatModifier(address()); }
        /** @return the value of the {@code drmFormatModifierPlaneCount} field. */
        @NativeType("uint32_t")
        public int drmFormatModifierPlaneCount() { return VkDrmFormatModifierProperties2EXT.ndrmFormatModifierPlaneCount(address()); }
        /** @return the value of the {@code drmFormatModifierTilingFeatures} field. */
        @NativeType("VkFormatFeatureFlags2")
        public long drmFormatModifierTilingFeatures() { return VkDrmFormatModifierProperties2EXT.ndrmFormatModifierTilingFeatures(address()); }

    }

}