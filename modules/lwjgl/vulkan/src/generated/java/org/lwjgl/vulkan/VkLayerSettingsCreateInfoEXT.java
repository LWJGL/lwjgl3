/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkLayerSettingsCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t settingCount;
 *     {@link VkLayerSettingEXT VkLayerSettingEXT} const * pSettings;
 * }}</pre>
 */
public class VkLayerSettingsCreateInfoEXT extends Struct<VkLayerSettingsCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SETTINGCOUNT,
        PSETTINGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SETTINGCOUNT = layout.offsetof(2);
        PSETTINGS = layout.offsetof(3);
    }

    protected VkLayerSettingsCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkLayerSettingsCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkLayerSettingsCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkLayerSettingsCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkLayerSettingsCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code settingCount} field. */
    @NativeType("uint32_t")
    public int settingCount() { return nsettingCount(address()); }
    /** @return a {@link VkLayerSettingEXT.Buffer} view of the struct array pointed to by the {@code pSettings} field. */
    @NativeType("VkLayerSettingEXT const *")
    public VkLayerSettingEXT.@Nullable Buffer pSettings() { return npSettings(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkLayerSettingsCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTLayerSettings#VK_STRUCTURE_TYPE_LAYER_SETTINGS_CREATE_INFO_EXT STRUCTURE_TYPE_LAYER_SETTINGS_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkLayerSettingsCreateInfoEXT sType$Default() { return sType(EXTLayerSettings.VK_STRUCTURE_TYPE_LAYER_SETTINGS_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkLayerSettingsCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkLayerSettingEXT.Buffer} to the {@code pSettings} field. */
    public VkLayerSettingsCreateInfoEXT pSettings(@NativeType("VkLayerSettingEXT const *") VkLayerSettingEXT.@Nullable Buffer value) { npSettings(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkLayerSettingsCreateInfoEXT set(
        int sType,
        long pNext,
        VkLayerSettingEXT.@Nullable Buffer pSettings
    ) {
        sType(sType);
        pNext(pNext);
        pSettings(pSettings);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkLayerSettingsCreateInfoEXT set(VkLayerSettingsCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkLayerSettingsCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkLayerSettingsCreateInfoEXT malloc() {
        return new VkLayerSettingsCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkLayerSettingsCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkLayerSettingsCreateInfoEXT calloc() {
        return new VkLayerSettingsCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkLayerSettingsCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkLayerSettingsCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkLayerSettingsCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkLayerSettingsCreateInfoEXT} instance for the specified memory address. */
    public static VkLayerSettingsCreateInfoEXT create(long address) {
        return new VkLayerSettingsCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkLayerSettingsCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkLayerSettingsCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkLayerSettingsCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkLayerSettingsCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkLayerSettingsCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkLayerSettingsCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkLayerSettingsCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkLayerSettingsCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkLayerSettingsCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkLayerSettingsCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkLayerSettingsCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkLayerSettingsCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkLayerSettingsCreateInfoEXT malloc(MemoryStack stack) {
        return new VkLayerSettingsCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkLayerSettingsCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkLayerSettingsCreateInfoEXT calloc(MemoryStack stack) {
        return new VkLayerSettingsCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkLayerSettingsCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkLayerSettingsCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkLayerSettingsCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkLayerSettingsCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkLayerSettingsCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkLayerSettingsCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #settingCount}. */
    public static int nsettingCount(long struct) { return memGetInt(struct + VkLayerSettingsCreateInfoEXT.SETTINGCOUNT); }
    /** Unsafe version of {@link #pSettings}. */
    public static VkLayerSettingEXT.@Nullable Buffer npSettings(long struct) { return VkLayerSettingEXT.createSafe(memGetAddress(struct + VkLayerSettingsCreateInfoEXT.PSETTINGS), nsettingCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkLayerSettingsCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkLayerSettingsCreateInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code settingCount} field of the specified {@code struct}. */
    public static void nsettingCount(long struct, int value) { memPutInt(struct + VkLayerSettingsCreateInfoEXT.SETTINGCOUNT, value); }
    /** Unsafe version of {@link #pSettings(VkLayerSettingEXT.Buffer) pSettings}. */
    public static void npSettings(long struct, VkLayerSettingEXT.@Nullable Buffer value) { memPutAddress(struct + VkLayerSettingsCreateInfoEXT.PSETTINGS, memAddressSafe(value)); nsettingCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int settingCount = nsettingCount(struct);
        if (settingCount != 0) {
            long pSettings = memGetAddress(struct + VkLayerSettingsCreateInfoEXT.PSETTINGS);
            check(pSettings);
            validate(pSettings, settingCount, VkLayerSettingEXT.SIZEOF, VkLayerSettingEXT::validate);
        }
    }

    // -----------------------------------

    /** An array of {@link VkLayerSettingsCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkLayerSettingsCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkLayerSettingsCreateInfoEXT ELEMENT_FACTORY = VkLayerSettingsCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkLayerSettingsCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkLayerSettingsCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkLayerSettingsCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkLayerSettingsCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkLayerSettingsCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@code settingCount} field. */
        @NativeType("uint32_t")
        public int settingCount() { return VkLayerSettingsCreateInfoEXT.nsettingCount(address()); }
        /** @return a {@link VkLayerSettingEXT.Buffer} view of the struct array pointed to by the {@code pSettings} field. */
        @NativeType("VkLayerSettingEXT const *")
        public VkLayerSettingEXT.@Nullable Buffer pSettings() { return VkLayerSettingsCreateInfoEXT.npSettings(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkLayerSettingsCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkLayerSettingsCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTLayerSettings#VK_STRUCTURE_TYPE_LAYER_SETTINGS_CREATE_INFO_EXT STRUCTURE_TYPE_LAYER_SETTINGS_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkLayerSettingsCreateInfoEXT.Buffer sType$Default() { return sType(EXTLayerSettings.VK_STRUCTURE_TYPE_LAYER_SETTINGS_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkLayerSettingsCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkLayerSettingsCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkLayerSettingEXT.Buffer} to the {@code pSettings} field. */
        public VkLayerSettingsCreateInfoEXT.Buffer pSettings(@NativeType("VkLayerSettingEXT const *") VkLayerSettingEXT.@Nullable Buffer value) { VkLayerSettingsCreateInfoEXT.npSettings(address(), value); return this; }

    }

}