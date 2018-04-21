/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct nk_configuration_stacks {
 *     {@link NkConfigStackStyleItem struct nk_config_stack_style_item} style_items;
 *     {@link NkConfigStackFloat struct nk_config_stack_float} floats;
 *     {@link NkConfigStackVec2 struct nk_config_stack_vec2} vectors;
 *     {@link NkConfigStackFlags struct nk_config_stack_flags} flags;
 *     {@link NkConfigStackColor struct nk_config_stack_color} colors;
 *     {@link NkConfigStackUserFont struct nk_config_stack_user_font} fonts;
 *     {@link NkConfigStackButtonBehavior struct nk_config_stack_button_behavior} button_behaviors;
 * }</pre></code>
 */
@NativeType("struct nk_configuration_stacks")
class NkConfigurationStacks extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYLE_ITEMS,
        FLOATS,
        VECTORS,
        FLAGS,
        COLORS,
        FONTS,
        BUTTON_BEHAVIORS;

    static {
        Layout layout = __struct(
            __member(NkConfigStackStyleItem.SIZEOF, NkConfigStackStyleItem.ALIGNOF),
            __member(NkConfigStackFloat.SIZEOF, NkConfigStackFloat.ALIGNOF),
            __member(NkConfigStackVec2.SIZEOF, NkConfigStackVec2.ALIGNOF),
            __member(NkConfigStackFlags.SIZEOF, NkConfigStackFlags.ALIGNOF),
            __member(NkConfigStackColor.SIZEOF, NkConfigStackColor.ALIGNOF),
            __member(NkConfigStackUserFont.SIZEOF, NkConfigStackUserFont.ALIGNOF),
            __member(NkConfigStackButtonBehavior.SIZEOF, NkConfigStackButtonBehavior.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYLE_ITEMS = layout.offsetof(0);
        FLOATS = layout.offsetof(1);
        VECTORS = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        COLORS = layout.offsetof(4);
        FONTS = layout.offsetof(5);
        BUTTON_BEHAVIORS = layout.offsetof(6);
    }

    NkConfigurationStacks(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NkConfigurationStacks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    NkConfigurationStacks(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link NkConfigStackStyleItem} view of the {@code style_items} field. */
    @NativeType("struct nk_config_stack_style_item")
    public NkConfigStackStyleItem style_items() { return nstyle_items(address()); }
    /** Returns a {@link NkConfigStackFloat} view of the {@code floats} field. */
    @NativeType("struct nk_config_stack_float")
    public NkConfigStackFloat floats() { return nfloats(address()); }
    /** Returns a {@link NkConfigStackVec2} view of the {@code vectors} field. */
    @NativeType("struct nk_config_stack_vec2")
    public NkConfigStackVec2 vectors() { return nvectors(address()); }
    /** Returns a {@link NkConfigStackFlags} view of the {@code flags} field. */
    @NativeType("struct nk_config_stack_flags")
    public NkConfigStackFlags flags() { return nflags(address()); }
    /** Returns a {@link NkConfigStackColor} view of the {@code colors} field. */
    @NativeType("struct nk_config_stack_color")
    public NkConfigStackColor colors() { return ncolors(address()); }
    /** Returns a {@link NkConfigStackUserFont} view of the {@code fonts} field. */
    @NativeType("struct nk_config_stack_user_font")
    public NkConfigStackUserFont fonts() { return nfonts(address()); }
    /** Returns a {@link NkConfigStackButtonBehavior} view of the {@code button_behaviors} field. */
    @NativeType("struct nk_config_stack_button_behavior")
    public NkConfigStackButtonBehavior button_behaviors() { return nbutton_behaviors(address()); }

    // -----------------------------------

    /** Returns a new {@link NkConfigurationStacks} instance for the specified memory address. */
    public static NkConfigurationStacks create(long address) {
        return new NkConfigurationStacks(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkConfigurationStacks createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link NkConfigurationStacks.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkConfigurationStacks.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkConfigurationStacks.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #style_items}. */
    public static NkConfigStackStyleItem nstyle_items(long struct) { return NkConfigStackStyleItem.create(struct + NkConfigurationStacks.STYLE_ITEMS); }
    /** Unsafe version of {@link #floats}. */
    public static NkConfigStackFloat nfloats(long struct) { return NkConfigStackFloat.create(struct + NkConfigurationStacks.FLOATS); }
    /** Unsafe version of {@link #vectors}. */
    public static NkConfigStackVec2 nvectors(long struct) { return NkConfigStackVec2.create(struct + NkConfigurationStacks.VECTORS); }
    /** Unsafe version of {@link #flags}. */
    public static NkConfigStackFlags nflags(long struct) { return NkConfigStackFlags.create(struct + NkConfigurationStacks.FLAGS); }
    /** Unsafe version of {@link #colors}. */
    public static NkConfigStackColor ncolors(long struct) { return NkConfigStackColor.create(struct + NkConfigurationStacks.COLORS); }
    /** Unsafe version of {@link #fonts}. */
    public static NkConfigStackUserFont nfonts(long struct) { return NkConfigStackUserFont.create(struct + NkConfigurationStacks.FONTS); }
    /** Unsafe version of {@link #button_behaviors}. */
    public static NkConfigStackButtonBehavior nbutton_behaviors(long struct) { return NkConfigStackButtonBehavior.create(struct + NkConfigurationStacks.BUTTON_BEHAVIORS); }

    // -----------------------------------

    /** An array of {@link NkConfigurationStacks} structs. */
    public static class Buffer extends StructBuffer<NkConfigurationStacks, Buffer> {

        /**
         * Creates a new {@link NkConfigurationStacks.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkConfigurationStacks#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected NkConfigurationStacks newInstance(long address) {
            return new NkConfigurationStacks(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link NkConfigStackStyleItem} view of the {@code style_items} field. */
        @NativeType("struct nk_config_stack_style_item")
        public NkConfigStackStyleItem style_items() { return NkConfigurationStacks.nstyle_items(address()); }
        /** Returns a {@link NkConfigStackFloat} view of the {@code floats} field. */
        @NativeType("struct nk_config_stack_float")
        public NkConfigStackFloat floats() { return NkConfigurationStacks.nfloats(address()); }
        /** Returns a {@link NkConfigStackVec2} view of the {@code vectors} field. */
        @NativeType("struct nk_config_stack_vec2")
        public NkConfigStackVec2 vectors() { return NkConfigurationStacks.nvectors(address()); }
        /** Returns a {@link NkConfigStackFlags} view of the {@code flags} field. */
        @NativeType("struct nk_config_stack_flags")
        public NkConfigStackFlags flags() { return NkConfigurationStacks.nflags(address()); }
        /** Returns a {@link NkConfigStackColor} view of the {@code colors} field. */
        @NativeType("struct nk_config_stack_color")
        public NkConfigStackColor colors() { return NkConfigurationStacks.ncolors(address()); }
        /** Returns a {@link NkConfigStackUserFont} view of the {@code fonts} field. */
        @NativeType("struct nk_config_stack_user_font")
        public NkConfigStackUserFont fonts() { return NkConfigurationStacks.nfonts(address()); }
        /** Returns a {@link NkConfigStackButtonBehavior} view of the {@code button_behaviors} field. */
        @NativeType("struct nk_config_stack_button_behavior")
        public NkConfigStackButtonBehavior button_behaviors() { return NkConfigurationStacks.nbutton_behaviors(address()); }

    }

}