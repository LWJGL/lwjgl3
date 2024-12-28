/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_VirtualJoystickDesc {
 *     Uint32 version;
 *     Uint16 type;
 *     Uint16 padding;
 *     Uint16 vendor_id;
 *     Uint16 product_id;
 *     Uint16 naxes;
 *     Uint16 nbuttons;
 *     Uint16 nballs;
 *     Uint16 nhats;
 *     Uint16 ntouchpads;
 *     Uint16 nsensors;
 *     Uint16 padding2[2];
 *     Uint32 button_mask;
 *     Uint32 axis_mask;
 *     char const * name;
 *     {@link SDL_VirtualJoystickTouchpadDesc SDL_VirtualJoystickTouchpadDesc} const * touchpads;
 *     {@link SDL_VirtualJoystickSensorDesc SDL_VirtualJoystickSensorDesc} const * sensors;
 *     void * userdata;
 *     void (* Update) (void * userdata);
 *     void (* SetPlayerIndex) (void * userdata, int player_index);
 *     bool (* Rumble) (void * userdata, Uint16 low_frequency_rumble, Uint16 high_frequency_rumble);
 *     bool (* RumbleTriggers) (void * userdata, Uint16 left_rumble, Uint16 right_rumble);
 *     bool (* SetLED) (void * userdata, Uint8 red, Uint8 green, Uint8 blue);
 *     bool (* SendEffect) (void * userdata, void const * data, int size);
 *     bool (* SetSensorsEnabled) (void * userdata, bool enabled);
 *     void (* Cleanup) (void * userdata);
 * }}</pre>
 */
public class SDL_VirtualJoystickDesc extends Struct<SDL_VirtualJoystickDesc> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERSION,
        TYPE,
        PADDING,
        VENDOR_ID,
        PRODUCT_ID,
        NAXES,
        NBUTTONS,
        NBALLS,
        NHATS,
        NTOUCHPADS,
        NSENSORS,
        PADDING2,
        BUTTON_MASK,
        AXIS_MASK,
        NAME,
        TOUCHPADS,
        SENSORS,
        USERDATA,
        UPDATE,
        SETPLAYERINDEX,
        RUMBLE,
        RUMBLETRIGGERS,
        SETLED,
        SENDEFFECT,
        SETSENSORSENABLED,
        CLEANUP;

    static {
        Layout layout = __struct(
            __member(4),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __array(2, 2),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERSION = layout.offsetof(0);
        TYPE = layout.offsetof(1);
        PADDING = layout.offsetof(2);
        VENDOR_ID = layout.offsetof(3);
        PRODUCT_ID = layout.offsetof(4);
        NAXES = layout.offsetof(5);
        NBUTTONS = layout.offsetof(6);
        NBALLS = layout.offsetof(7);
        NHATS = layout.offsetof(8);
        NTOUCHPADS = layout.offsetof(9);
        NSENSORS = layout.offsetof(10);
        PADDING2 = layout.offsetof(11);
        BUTTON_MASK = layout.offsetof(12);
        AXIS_MASK = layout.offsetof(13);
        NAME = layout.offsetof(14);
        TOUCHPADS = layout.offsetof(15);
        SENSORS = layout.offsetof(16);
        USERDATA = layout.offsetof(17);
        UPDATE = layout.offsetof(18);
        SETPLAYERINDEX = layout.offsetof(19);
        RUMBLE = layout.offsetof(20);
        RUMBLETRIGGERS = layout.offsetof(21);
        SETLED = layout.offsetof(22);
        SENDEFFECT = layout.offsetof(23);
        SETSENSORSENABLED = layout.offsetof(24);
        CLEANUP = layout.offsetof(25);
    }

    protected SDL_VirtualJoystickDesc(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_VirtualJoystickDesc create(long address, @Nullable ByteBuffer container) {
        return new SDL_VirtualJoystickDesc(address, container);
    }

    /**
     * Creates a {@code SDL_VirtualJoystickDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_VirtualJoystickDesc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code version} field. */
    @NativeType("Uint32")
    public int version() { return nversion(address()); }
    /** @return the value of the {@code type} field. */
    @NativeType("Uint16")
    public short type() { return ntype(address()); }
    /** @return the value of the {@code vendor_id} field. */
    @NativeType("Uint16")
    public short vendor_id() { return nvendor_id(address()); }
    /** @return the value of the {@code product_id} field. */
    @NativeType("Uint16")
    public short product_id() { return nproduct_id(address()); }
    /** @return the value of the {@code naxes} field. */
    @NativeType("Uint16")
    public short naxes() { return nnaxes(address()); }
    /** @return the value of the {@code nbuttons} field. */
    @NativeType("Uint16")
    public short nbuttons() { return nnbuttons(address()); }
    /** @return the value of the {@code nballs} field. */
    @NativeType("Uint16")
    public short nballs() { return nnballs(address()); }
    /** @return the value of the {@code nhats} field. */
    @NativeType("Uint16")
    public short nhats() { return nnhats(address()); }
    /** @return the value of the {@code ntouchpads} field. */
    @NativeType("Uint16")
    public short ntouchpads() { return nntouchpads(address()); }
    /** @return the value of the {@code nsensors} field. */
    @NativeType("Uint16")
    public short nsensors() { return nnsensors(address()); }
    /** @return the value of the {@code button_mask} field. */
    @NativeType("Uint32")
    public int button_mask() { return nbutton_mask(address()); }
    /** @return the value of the {@code axis_mask} field. */
    @NativeType("Uint32")
    public int axis_mask() { return naxis_mask(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public String nameString() { return nnameString(address()); }
    /** @return a {@link SDL_VirtualJoystickTouchpadDesc.Buffer} view of the struct array pointed to by the {@code touchpads} field. */
    @NativeType("SDL_VirtualJoystickTouchpadDesc const *")
    public SDL_VirtualJoystickTouchpadDesc.@Nullable Buffer touchpads() { return ntouchpads(address()); }
    /** @return a {@link SDL_VirtualJoystickSensorDesc.Buffer} view of the struct array pointed to by the {@code sensors} field. */
    @NativeType("SDL_VirtualJoystickSensorDesc const *")
    public SDL_VirtualJoystickSensorDesc.@Nullable Buffer sensors() { return nsensors(address()); }
    /** @return the value of the {@code userdata} field. */
    @NativeType("void *")
    public long userdata() { return nuserdata(address()); }
    /** @return the value of the {@code Update} field. */
    @NativeType("void (*) (void *)")
    public @Nullable SDL_VirtualJoystickDescUpdateCallback Update() { return nUpdate(address()); }
    /** @return the value of the {@code SetPlayerIndex} field. */
    @NativeType("void (*) (void *, int)")
    public @Nullable SDL_VirtualJoystickDescSetPlayerIndexCallback SetPlayerIndex() { return nSetPlayerIndex(address()); }
    /** @return the value of the {@code Rumble} field. */
    @NativeType("bool (*) (void *, Uint16, Uint16)")
    public @Nullable SDL_VirtualJoystickDescRumbleCallback Rumble() { return nRumble(address()); }
    /** @return the value of the {@code RumbleTriggers} field. */
    @NativeType("bool (*) (void *, Uint16, Uint16)")
    public @Nullable SDL_VirtualJoystickDescRumbleTriggersCallback RumbleTriggers() { return nRumbleTriggers(address()); }
    /** @return the value of the {@code SetLED} field. */
    @NativeType("bool (*) (void *, Uint8, Uint8, Uint8)")
    public @Nullable SDL_VirtualJoystickDescSetLEDCallback SetLED() { return nSetLED(address()); }
    /** @return the value of the {@code SendEffect} field. */
    @NativeType("bool (*) (void *, void const *, int)")
    public @Nullable SDL_VirtualJoystickDescSendEffectCallback SendEffect() { return nSendEffect(address()); }
    /** @return the value of the {@code SetSensorsEnabled} field. */
    @NativeType("bool (*) (void *, bool)")
    public @Nullable SDL_VirtualJoystickDescSetSensorsEnabledCallback SetSensorsEnabled() { return nSetSensorsEnabled(address()); }
    /** @return the value of the {@code Cleanup} field. */
    @NativeType("void (*) (void *)")
    public @Nullable SDL_VirtualJoystickDescCleanupCallback Cleanup() { return nCleanup(address()); }

    /** Sets the specified value to the {@code version} field. */
    public SDL_VirtualJoystickDesc version(@NativeType("Uint32") int value) { nversion(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public SDL_VirtualJoystickDesc type(@NativeType("Uint16") short value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code vendor_id} field. */
    public SDL_VirtualJoystickDesc vendor_id(@NativeType("Uint16") short value) { nvendor_id(address(), value); return this; }
    /** Sets the specified value to the {@code product_id} field. */
    public SDL_VirtualJoystickDesc product_id(@NativeType("Uint16") short value) { nproduct_id(address(), value); return this; }
    /** Sets the specified value to the {@code naxes} field. */
    public SDL_VirtualJoystickDesc naxes(@NativeType("Uint16") short value) { nnaxes(address(), value); return this; }
    /** Sets the specified value to the {@code nbuttons} field. */
    public SDL_VirtualJoystickDesc nbuttons(@NativeType("Uint16") short value) { nnbuttons(address(), value); return this; }
    /** Sets the specified value to the {@code nballs} field. */
    public SDL_VirtualJoystickDesc nballs(@NativeType("Uint16") short value) { nnballs(address(), value); return this; }
    /** Sets the specified value to the {@code nhats} field. */
    public SDL_VirtualJoystickDesc nhats(@NativeType("Uint16") short value) { nnhats(address(), value); return this; }
    /** Sets the specified value to the {@code ntouchpads} field. */
    public SDL_VirtualJoystickDesc ntouchpads(@NativeType("Uint16") short value) { nntouchpads(address(), value); return this; }
    /** Sets the specified value to the {@code nsensors} field. */
    public SDL_VirtualJoystickDesc nsensors(@NativeType("Uint16") short value) { nnsensors(address(), value); return this; }
    /** Sets the specified value to the {@code button_mask} field. */
    public SDL_VirtualJoystickDesc button_mask(@NativeType("Uint32") int value) { nbutton_mask(address(), value); return this; }
    /** Sets the specified value to the {@code axis_mask} field. */
    public SDL_VirtualJoystickDesc axis_mask(@NativeType("Uint32") int value) { naxis_mask(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code name} field. */
    public SDL_VirtualJoystickDesc name(@NativeType("char const *") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the address of the specified {@link SDL_VirtualJoystickTouchpadDesc.Buffer} to the {@code touchpads} field. */
    public SDL_VirtualJoystickDesc touchpads(@NativeType("SDL_VirtualJoystickTouchpadDesc const *") SDL_VirtualJoystickTouchpadDesc.@Nullable Buffer value) { ntouchpads(address(), value); return this; }
    /** Sets the address of the specified {@link SDL_VirtualJoystickSensorDesc.Buffer} to the {@code sensors} field. */
    public SDL_VirtualJoystickDesc sensors(@NativeType("SDL_VirtualJoystickSensorDesc const *") SDL_VirtualJoystickSensorDesc.@Nullable Buffer value) { nsensors(address(), value); return this; }
    /** Sets the specified value to the {@code userdata} field. */
    public SDL_VirtualJoystickDesc userdata(@NativeType("void *") long value) { nuserdata(address(), value); return this; }
    /** Sets the specified value to the {@code Update} field. */
    public SDL_VirtualJoystickDesc Update(@Nullable @NativeType("void (*) (void *)") SDL_VirtualJoystickDescUpdateCallbackI value) { nUpdate(address(), value); return this; }
    /** Sets the specified value to the {@code SetPlayerIndex} field. */
    public SDL_VirtualJoystickDesc SetPlayerIndex(@Nullable @NativeType("void (*) (void *, int)") SDL_VirtualJoystickDescSetPlayerIndexCallbackI value) { nSetPlayerIndex(address(), value); return this; }
    /** Sets the specified value to the {@code Rumble} field. */
    public SDL_VirtualJoystickDesc Rumble(@Nullable @NativeType("bool (*) (void *, Uint16, Uint16)") SDL_VirtualJoystickDescRumbleCallbackI value) { nRumble(address(), value); return this; }
    /** Sets the specified value to the {@code RumbleTriggers} field. */
    public SDL_VirtualJoystickDesc RumbleTriggers(@Nullable @NativeType("bool (*) (void *, Uint16, Uint16)") SDL_VirtualJoystickDescRumbleTriggersCallbackI value) { nRumbleTriggers(address(), value); return this; }
    /** Sets the specified value to the {@code SetLED} field. */
    public SDL_VirtualJoystickDesc SetLED(@Nullable @NativeType("bool (*) (void *, Uint8, Uint8, Uint8)") SDL_VirtualJoystickDescSetLEDCallbackI value) { nSetLED(address(), value); return this; }
    /** Sets the specified value to the {@code SendEffect} field. */
    public SDL_VirtualJoystickDesc SendEffect(@Nullable @NativeType("bool (*) (void *, void const *, int)") SDL_VirtualJoystickDescSendEffectCallbackI value) { nSendEffect(address(), value); return this; }
    /** Sets the specified value to the {@code SetSensorsEnabled} field. */
    public SDL_VirtualJoystickDesc SetSensorsEnabled(@Nullable @NativeType("bool (*) (void *, bool)") SDL_VirtualJoystickDescSetSensorsEnabledCallbackI value) { nSetSensorsEnabled(address(), value); return this; }
    /** Sets the specified value to the {@code Cleanup} field. */
    public SDL_VirtualJoystickDesc Cleanup(@Nullable @NativeType("void (*) (void *)") SDL_VirtualJoystickDescCleanupCallbackI value) { nCleanup(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_VirtualJoystickDesc set(
        int version,
        short type,
        short vendor_id,
        short product_id,
        short naxes,
        short nbuttons,
        short nballs,
        short nhats,
        short ntouchpads,
        short nsensors,
        int button_mask,
        int axis_mask,
        ByteBuffer name,
        SDL_VirtualJoystickTouchpadDesc.@Nullable Buffer touchpads,
        SDL_VirtualJoystickSensorDesc.@Nullable Buffer sensors,
        long userdata,
        @Nullable SDL_VirtualJoystickDescUpdateCallbackI Update,
        @Nullable SDL_VirtualJoystickDescSetPlayerIndexCallbackI SetPlayerIndex,
        @Nullable SDL_VirtualJoystickDescRumbleCallbackI Rumble,
        @Nullable SDL_VirtualJoystickDescRumbleTriggersCallbackI RumbleTriggers,
        @Nullable SDL_VirtualJoystickDescSetLEDCallbackI SetLED,
        @Nullable SDL_VirtualJoystickDescSendEffectCallbackI SendEffect,
        @Nullable SDL_VirtualJoystickDescSetSensorsEnabledCallbackI SetSensorsEnabled,
        @Nullable SDL_VirtualJoystickDescCleanupCallbackI Cleanup
    ) {
        version(version);
        type(type);
        vendor_id(vendor_id);
        product_id(product_id);
        naxes(naxes);
        nbuttons(nbuttons);
        nballs(nballs);
        nhats(nhats);
        ntouchpads(ntouchpads);
        nsensors(nsensors);
        button_mask(button_mask);
        axis_mask(axis_mask);
        name(name);
        touchpads(touchpads);
        sensors(sensors);
        userdata(userdata);
        Update(Update);
        SetPlayerIndex(SetPlayerIndex);
        Rumble(Rumble);
        RumbleTriggers(RumbleTriggers);
        SetLED(SetLED);
        SendEffect(SendEffect);
        SetSensorsEnabled(SetSensorsEnabled);
        Cleanup(Cleanup);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_VirtualJoystickDesc set(SDL_VirtualJoystickDesc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_VirtualJoystickDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_VirtualJoystickDesc malloc() {
        return new SDL_VirtualJoystickDesc(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_VirtualJoystickDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_VirtualJoystickDesc calloc() {
        return new SDL_VirtualJoystickDesc(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_VirtualJoystickDesc} instance allocated with {@link BufferUtils}. */
    public static SDL_VirtualJoystickDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_VirtualJoystickDesc(memAddress(container), container);
    }

    /** Returns a new {@code SDL_VirtualJoystickDesc} instance for the specified memory address. */
    public static SDL_VirtualJoystickDesc create(long address) {
        return new SDL_VirtualJoystickDesc(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_VirtualJoystickDesc createSafe(long address) {
        return address == NULL ? null : new SDL_VirtualJoystickDesc(address, null);
    }

    /**
     * Returns a new {@link SDL_VirtualJoystickDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_VirtualJoystickDesc.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_VirtualJoystickDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_VirtualJoystickDesc.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_VirtualJoystickDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_VirtualJoystickDesc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_VirtualJoystickDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_VirtualJoystickDesc.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_VirtualJoystickDesc.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_VirtualJoystickDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_VirtualJoystickDesc malloc(MemoryStack stack) {
        return new SDL_VirtualJoystickDesc(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_VirtualJoystickDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_VirtualJoystickDesc calloc(MemoryStack stack) {
        return new SDL_VirtualJoystickDesc(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_VirtualJoystickDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_VirtualJoystickDesc.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_VirtualJoystickDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_VirtualJoystickDesc.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #version}. */
    public static int nversion(long struct) { return memGetInt(struct + SDL_VirtualJoystickDesc.VERSION); }
    /** Unsafe version of {@link #type}. */
    public static short ntype(long struct) { return memGetShort(struct + SDL_VirtualJoystickDesc.TYPE); }
    public static short npadding(long struct) { return memGetShort(struct + SDL_VirtualJoystickDesc.PADDING); }
    /** Unsafe version of {@link #vendor_id}. */
    public static short nvendor_id(long struct) { return memGetShort(struct + SDL_VirtualJoystickDesc.VENDOR_ID); }
    /** Unsafe version of {@link #product_id}. */
    public static short nproduct_id(long struct) { return memGetShort(struct + SDL_VirtualJoystickDesc.PRODUCT_ID); }
    /** Unsafe version of {@link #naxes}. */
    public static short nnaxes(long struct) { return memGetShort(struct + SDL_VirtualJoystickDesc.NAXES); }
    /** Unsafe version of {@link #nbuttons}. */
    public static short nnbuttons(long struct) { return memGetShort(struct + SDL_VirtualJoystickDesc.NBUTTONS); }
    /** Unsafe version of {@link #nballs}. */
    public static short nnballs(long struct) { return memGetShort(struct + SDL_VirtualJoystickDesc.NBALLS); }
    /** Unsafe version of {@link #nhats}. */
    public static short nnhats(long struct) { return memGetShort(struct + SDL_VirtualJoystickDesc.NHATS); }
    /** Unsafe version of {@link #ntouchpads}. */
    public static short nntouchpads(long struct) { return memGetShort(struct + SDL_VirtualJoystickDesc.NTOUCHPADS); }
    /** Unsafe version of {@link #nsensors}. */
    public static short nnsensors(long struct) { return memGetShort(struct + SDL_VirtualJoystickDesc.NSENSORS); }
    public static ShortBuffer npadding2(long struct) { return memShortBuffer(struct + SDL_VirtualJoystickDesc.PADDING2, 2); }
    public static short npadding2(long struct, int index) {
        return memGetShort(struct + SDL_VirtualJoystickDesc.PADDING2 + check(index, 2) * 2);
    }
    /** Unsafe version of {@link #button_mask}. */
    public static int nbutton_mask(long struct) { return memGetInt(struct + SDL_VirtualJoystickDesc.BUTTON_MASK); }
    /** Unsafe version of {@link #axis_mask}. */
    public static int naxis_mask(long struct) { return memGetInt(struct + SDL_VirtualJoystickDesc.AXIS_MASK); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + SDL_VirtualJoystickDesc.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(memGetAddress(struct + SDL_VirtualJoystickDesc.NAME)); }
    /** Unsafe version of {@link #touchpads}. */
    public static SDL_VirtualJoystickTouchpadDesc.@Nullable Buffer ntouchpads(long struct) { return SDL_VirtualJoystickTouchpadDesc.createSafe(memGetAddress(struct + SDL_VirtualJoystickDesc.TOUCHPADS), Short.toUnsignedInt(nntouchpads(struct))); }
    /** Unsafe version of {@link #sensors}. */
    public static SDL_VirtualJoystickSensorDesc.@Nullable Buffer nsensors(long struct) { return SDL_VirtualJoystickSensorDesc.createSafe(memGetAddress(struct + SDL_VirtualJoystickDesc.SENSORS), Short.toUnsignedInt(nnsensors(struct))); }
    /** Unsafe version of {@link #userdata}. */
    public static long nuserdata(long struct) { return memGetAddress(struct + SDL_VirtualJoystickDesc.USERDATA); }
    /** Unsafe version of {@link #Update}. */
    public static @Nullable SDL_VirtualJoystickDescUpdateCallback nUpdate(long struct) { return SDL_VirtualJoystickDescUpdateCallback.createSafe(memGetAddress(struct + SDL_VirtualJoystickDesc.UPDATE)); }
    /** Unsafe version of {@link #SetPlayerIndex}. */
    public static @Nullable SDL_VirtualJoystickDescSetPlayerIndexCallback nSetPlayerIndex(long struct) { return SDL_VirtualJoystickDescSetPlayerIndexCallback.createSafe(memGetAddress(struct + SDL_VirtualJoystickDesc.SETPLAYERINDEX)); }
    /** Unsafe version of {@link #Rumble}. */
    public static @Nullable SDL_VirtualJoystickDescRumbleCallback nRumble(long struct) { return SDL_VirtualJoystickDescRumbleCallback.createSafe(memGetAddress(struct + SDL_VirtualJoystickDesc.RUMBLE)); }
    /** Unsafe version of {@link #RumbleTriggers}. */
    public static @Nullable SDL_VirtualJoystickDescRumbleTriggersCallback nRumbleTriggers(long struct) { return SDL_VirtualJoystickDescRumbleTriggersCallback.createSafe(memGetAddress(struct + SDL_VirtualJoystickDesc.RUMBLETRIGGERS)); }
    /** Unsafe version of {@link #SetLED}. */
    public static @Nullable SDL_VirtualJoystickDescSetLEDCallback nSetLED(long struct) { return SDL_VirtualJoystickDescSetLEDCallback.createSafe(memGetAddress(struct + SDL_VirtualJoystickDesc.SETLED)); }
    /** Unsafe version of {@link #SendEffect}. */
    public static @Nullable SDL_VirtualJoystickDescSendEffectCallback nSendEffect(long struct) { return SDL_VirtualJoystickDescSendEffectCallback.createSafe(memGetAddress(struct + SDL_VirtualJoystickDesc.SENDEFFECT)); }
    /** Unsafe version of {@link #SetSensorsEnabled}. */
    public static @Nullable SDL_VirtualJoystickDescSetSensorsEnabledCallback nSetSensorsEnabled(long struct) { return SDL_VirtualJoystickDescSetSensorsEnabledCallback.createSafe(memGetAddress(struct + SDL_VirtualJoystickDesc.SETSENSORSENABLED)); }
    /** Unsafe version of {@link #Cleanup}. */
    public static @Nullable SDL_VirtualJoystickDescCleanupCallback nCleanup(long struct) { return SDL_VirtualJoystickDescCleanupCallback.createSafe(memGetAddress(struct + SDL_VirtualJoystickDesc.CLEANUP)); }

    /** Unsafe version of {@link #version(int) version}. */
    public static void nversion(long struct, int value) { memPutInt(struct + SDL_VirtualJoystickDesc.VERSION, value); }
    /** Unsafe version of {@link #type(short) type}. */
    public static void ntype(long struct, short value) { memPutShort(struct + SDL_VirtualJoystickDesc.TYPE, value); }
    public static void npadding(long struct, short value) { memPutShort(struct + SDL_VirtualJoystickDesc.PADDING, value); }
    /** Unsafe version of {@link #vendor_id(short) vendor_id}. */
    public static void nvendor_id(long struct, short value) { memPutShort(struct + SDL_VirtualJoystickDesc.VENDOR_ID, value); }
    /** Unsafe version of {@link #product_id(short) product_id}. */
    public static void nproduct_id(long struct, short value) { memPutShort(struct + SDL_VirtualJoystickDesc.PRODUCT_ID, value); }
    /** Unsafe version of {@link #naxes(short) naxes}. */
    public static void nnaxes(long struct, short value) { memPutShort(struct + SDL_VirtualJoystickDesc.NAXES, value); }
    /** Unsafe version of {@link #nbuttons(short) nbuttons}. */
    public static void nnbuttons(long struct, short value) { memPutShort(struct + SDL_VirtualJoystickDesc.NBUTTONS, value); }
    /** Unsafe version of {@link #nballs(short) nballs}. */
    public static void nnballs(long struct, short value) { memPutShort(struct + SDL_VirtualJoystickDesc.NBALLS, value); }
    /** Unsafe version of {@link #nhats(short) nhats}. */
    public static void nnhats(long struct, short value) { memPutShort(struct + SDL_VirtualJoystickDesc.NHATS, value); }
    /** Sets the specified value to the {@code ntouchpads} field of the specified {@code struct}. */
    public static void nntouchpads(long struct, short value) { memPutShort(struct + SDL_VirtualJoystickDesc.NTOUCHPADS, value); }
    /** Sets the specified value to the {@code nsensors} field of the specified {@code struct}. */
    public static void nnsensors(long struct, short value) { memPutShort(struct + SDL_VirtualJoystickDesc.NSENSORS, value); }
    public static void npadding2(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + SDL_VirtualJoystickDesc.PADDING2, value.remaining() * 2);
    }
    public static void npadding2(long struct, int index, short value) {
        memPutShort(struct + SDL_VirtualJoystickDesc.PADDING2 + check(index, 2) * 2, value);
    }
    /** Unsafe version of {@link #button_mask(int) button_mask}. */
    public static void nbutton_mask(long struct, int value) { memPutInt(struct + SDL_VirtualJoystickDesc.BUTTON_MASK, value); }
    /** Unsafe version of {@link #axis_mask(int) axis_mask}. */
    public static void naxis_mask(long struct, int value) { memPutInt(struct + SDL_VirtualJoystickDesc.AXIS_MASK, value); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + SDL_VirtualJoystickDesc.NAME, memAddress(value));
    }
    /** Unsafe version of {@link #touchpads(SDL_VirtualJoystickTouchpadDesc.Buffer) touchpads}. */
    public static void ntouchpads(long struct, SDL_VirtualJoystickTouchpadDesc.@Nullable Buffer value) { memPutAddress(struct + SDL_VirtualJoystickDesc.TOUCHPADS, memAddressSafe(value)); nntouchpads(struct, value == null ? 0 : (short)value.remaining()); }
    /** Unsafe version of {@link #sensors(SDL_VirtualJoystickSensorDesc.Buffer) sensors}. */
    public static void nsensors(long struct, SDL_VirtualJoystickSensorDesc.@Nullable Buffer value) { memPutAddress(struct + SDL_VirtualJoystickDesc.SENSORS, memAddressSafe(value)); nnsensors(struct, value == null ? 0 : (short)value.remaining()); }
    /** Unsafe version of {@link #userdata(long) userdata}. */
    public static void nuserdata(long struct, long value) { memPutAddress(struct + SDL_VirtualJoystickDesc.USERDATA, value); }
    /** Unsafe version of {@link #Update(SDL_VirtualJoystickDescUpdateCallbackI) Update}. */
    public static void nUpdate(long struct, @Nullable SDL_VirtualJoystickDescUpdateCallbackI value) { memPutAddress(struct + SDL_VirtualJoystickDesc.UPDATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #SetPlayerIndex(SDL_VirtualJoystickDescSetPlayerIndexCallbackI) SetPlayerIndex}. */
    public static void nSetPlayerIndex(long struct, @Nullable SDL_VirtualJoystickDescSetPlayerIndexCallbackI value) { memPutAddress(struct + SDL_VirtualJoystickDesc.SETPLAYERINDEX, memAddressSafe(value)); }
    /** Unsafe version of {@link #Rumble(SDL_VirtualJoystickDescRumbleCallbackI) Rumble}. */
    public static void nRumble(long struct, @Nullable SDL_VirtualJoystickDescRumbleCallbackI value) { memPutAddress(struct + SDL_VirtualJoystickDesc.RUMBLE, memAddressSafe(value)); }
    /** Unsafe version of {@link #RumbleTriggers(SDL_VirtualJoystickDescRumbleTriggersCallbackI) RumbleTriggers}. */
    public static void nRumbleTriggers(long struct, @Nullable SDL_VirtualJoystickDescRumbleTriggersCallbackI value) { memPutAddress(struct + SDL_VirtualJoystickDesc.RUMBLETRIGGERS, memAddressSafe(value)); }
    /** Unsafe version of {@link #SetLED(SDL_VirtualJoystickDescSetLEDCallbackI) SetLED}. */
    public static void nSetLED(long struct, @Nullable SDL_VirtualJoystickDescSetLEDCallbackI value) { memPutAddress(struct + SDL_VirtualJoystickDesc.SETLED, memAddressSafe(value)); }
    /** Unsafe version of {@link #SendEffect(SDL_VirtualJoystickDescSendEffectCallbackI) SendEffect}. */
    public static void nSendEffect(long struct, @Nullable SDL_VirtualJoystickDescSendEffectCallbackI value) { memPutAddress(struct + SDL_VirtualJoystickDesc.SENDEFFECT, memAddressSafe(value)); }
    /** Unsafe version of {@link #SetSensorsEnabled(SDL_VirtualJoystickDescSetSensorsEnabledCallbackI) SetSensorsEnabled}. */
    public static void nSetSensorsEnabled(long struct, @Nullable SDL_VirtualJoystickDescSetSensorsEnabledCallbackI value) { memPutAddress(struct + SDL_VirtualJoystickDesc.SETSENSORSENABLED, memAddressSafe(value)); }
    /** Unsafe version of {@link #Cleanup(SDL_VirtualJoystickDescCleanupCallbackI) Cleanup}. */
    public static void nCleanup(long struct, @Nullable SDL_VirtualJoystickDescCleanupCallbackI value) { memPutAddress(struct + SDL_VirtualJoystickDesc.CLEANUP, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_VirtualJoystickDesc.NAME));
    }

    // -----------------------------------

    /** An array of {@link SDL_VirtualJoystickDesc} structs. */
    public static class Buffer extends StructBuffer<SDL_VirtualJoystickDesc, Buffer> implements NativeResource {

        private static final SDL_VirtualJoystickDesc ELEMENT_FACTORY = SDL_VirtualJoystickDesc.create(-1L);

        /**
         * Creates a new {@code SDL_VirtualJoystickDesc.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_VirtualJoystickDesc#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_VirtualJoystickDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code version} field. */
        @NativeType("Uint32")
        public int version() { return SDL_VirtualJoystickDesc.nversion(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("Uint16")
        public short type() { return SDL_VirtualJoystickDesc.ntype(address()); }
        /** @return the value of the {@code vendor_id} field. */
        @NativeType("Uint16")
        public short vendor_id() { return SDL_VirtualJoystickDesc.nvendor_id(address()); }
        /** @return the value of the {@code product_id} field. */
        @NativeType("Uint16")
        public short product_id() { return SDL_VirtualJoystickDesc.nproduct_id(address()); }
        /** @return the value of the {@code naxes} field. */
        @NativeType("Uint16")
        public short naxes() { return SDL_VirtualJoystickDesc.nnaxes(address()); }
        /** @return the value of the {@code nbuttons} field. */
        @NativeType("Uint16")
        public short nbuttons() { return SDL_VirtualJoystickDesc.nnbuttons(address()); }
        /** @return the value of the {@code nballs} field. */
        @NativeType("Uint16")
        public short nballs() { return SDL_VirtualJoystickDesc.nnballs(address()); }
        /** @return the value of the {@code nhats} field. */
        @NativeType("Uint16")
        public short nhats() { return SDL_VirtualJoystickDesc.nnhats(address()); }
        /** @return the value of the {@code ntouchpads} field. */
        @NativeType("Uint16")
        public short ntouchpads() { return SDL_VirtualJoystickDesc.nntouchpads(address()); }
        /** @return the value of the {@code nsensors} field. */
        @NativeType("Uint16")
        public short nsensors() { return SDL_VirtualJoystickDesc.nnsensors(address()); }
        /** @return the value of the {@code button_mask} field. */
        @NativeType("Uint32")
        public int button_mask() { return SDL_VirtualJoystickDesc.nbutton_mask(address()); }
        /** @return the value of the {@code axis_mask} field. */
        @NativeType("Uint32")
        public int axis_mask() { return SDL_VirtualJoystickDesc.naxis_mask(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public ByteBuffer name() { return SDL_VirtualJoystickDesc.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public String nameString() { return SDL_VirtualJoystickDesc.nnameString(address()); }
        /** @return a {@link SDL_VirtualJoystickTouchpadDesc.Buffer} view of the struct array pointed to by the {@code touchpads} field. */
        @NativeType("SDL_VirtualJoystickTouchpadDesc const *")
        public SDL_VirtualJoystickTouchpadDesc.@Nullable Buffer touchpads() { return SDL_VirtualJoystickDesc.ntouchpads(address()); }
        /** @return a {@link SDL_VirtualJoystickSensorDesc.Buffer} view of the struct array pointed to by the {@code sensors} field. */
        @NativeType("SDL_VirtualJoystickSensorDesc const *")
        public SDL_VirtualJoystickSensorDesc.@Nullable Buffer sensors() { return SDL_VirtualJoystickDesc.nsensors(address()); }
        /** @return the value of the {@code userdata} field. */
        @NativeType("void *")
        public long userdata() { return SDL_VirtualJoystickDesc.nuserdata(address()); }
        /** @return the value of the {@code Update} field. */
        @NativeType("void (*) (void *)")
        public @Nullable SDL_VirtualJoystickDescUpdateCallback Update() { return SDL_VirtualJoystickDesc.nUpdate(address()); }
        /** @return the value of the {@code SetPlayerIndex} field. */
        @NativeType("void (*) (void *, int)")
        public @Nullable SDL_VirtualJoystickDescSetPlayerIndexCallback SetPlayerIndex() { return SDL_VirtualJoystickDesc.nSetPlayerIndex(address()); }
        /** @return the value of the {@code Rumble} field. */
        @NativeType("bool (*) (void *, Uint16, Uint16)")
        public @Nullable SDL_VirtualJoystickDescRumbleCallback Rumble() { return SDL_VirtualJoystickDesc.nRumble(address()); }
        /** @return the value of the {@code RumbleTriggers} field. */
        @NativeType("bool (*) (void *, Uint16, Uint16)")
        public @Nullable SDL_VirtualJoystickDescRumbleTriggersCallback RumbleTriggers() { return SDL_VirtualJoystickDesc.nRumbleTriggers(address()); }
        /** @return the value of the {@code SetLED} field. */
        @NativeType("bool (*) (void *, Uint8, Uint8, Uint8)")
        public @Nullable SDL_VirtualJoystickDescSetLEDCallback SetLED() { return SDL_VirtualJoystickDesc.nSetLED(address()); }
        /** @return the value of the {@code SendEffect} field. */
        @NativeType("bool (*) (void *, void const *, int)")
        public @Nullable SDL_VirtualJoystickDescSendEffectCallback SendEffect() { return SDL_VirtualJoystickDesc.nSendEffect(address()); }
        /** @return the value of the {@code SetSensorsEnabled} field. */
        @NativeType("bool (*) (void *, bool)")
        public @Nullable SDL_VirtualJoystickDescSetSensorsEnabledCallback SetSensorsEnabled() { return SDL_VirtualJoystickDesc.nSetSensorsEnabled(address()); }
        /** @return the value of the {@code Cleanup} field. */
        @NativeType("void (*) (void *)")
        public @Nullable SDL_VirtualJoystickDescCleanupCallback Cleanup() { return SDL_VirtualJoystickDesc.nCleanup(address()); }

        /** Sets the specified value to the {@code version} field. */
        public SDL_VirtualJoystickDesc.Buffer version(@NativeType("Uint32") int value) { SDL_VirtualJoystickDesc.nversion(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public SDL_VirtualJoystickDesc.Buffer type(@NativeType("Uint16") short value) { SDL_VirtualJoystickDesc.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code vendor_id} field. */
        public SDL_VirtualJoystickDesc.Buffer vendor_id(@NativeType("Uint16") short value) { SDL_VirtualJoystickDesc.nvendor_id(address(), value); return this; }
        /** Sets the specified value to the {@code product_id} field. */
        public SDL_VirtualJoystickDesc.Buffer product_id(@NativeType("Uint16") short value) { SDL_VirtualJoystickDesc.nproduct_id(address(), value); return this; }
        /** Sets the specified value to the {@code naxes} field. */
        public SDL_VirtualJoystickDesc.Buffer naxes(@NativeType("Uint16") short value) { SDL_VirtualJoystickDesc.nnaxes(address(), value); return this; }
        /** Sets the specified value to the {@code nbuttons} field. */
        public SDL_VirtualJoystickDesc.Buffer nbuttons(@NativeType("Uint16") short value) { SDL_VirtualJoystickDesc.nnbuttons(address(), value); return this; }
        /** Sets the specified value to the {@code nballs} field. */
        public SDL_VirtualJoystickDesc.Buffer nballs(@NativeType("Uint16") short value) { SDL_VirtualJoystickDesc.nnballs(address(), value); return this; }
        /** Sets the specified value to the {@code nhats} field. */
        public SDL_VirtualJoystickDesc.Buffer nhats(@NativeType("Uint16") short value) { SDL_VirtualJoystickDesc.nnhats(address(), value); return this; }
        /** Sets the specified value to the {@code ntouchpads} field. */
        public SDL_VirtualJoystickDesc.Buffer ntouchpads(@NativeType("Uint16") short value) { SDL_VirtualJoystickDesc.nntouchpads(address(), value); return this; }
        /** Sets the specified value to the {@code nsensors} field. */
        public SDL_VirtualJoystickDesc.Buffer nsensors(@NativeType("Uint16") short value) { SDL_VirtualJoystickDesc.nnsensors(address(), value); return this; }
        /** Sets the specified value to the {@code button_mask} field. */
        public SDL_VirtualJoystickDesc.Buffer button_mask(@NativeType("Uint32") int value) { SDL_VirtualJoystickDesc.nbutton_mask(address(), value); return this; }
        /** Sets the specified value to the {@code axis_mask} field. */
        public SDL_VirtualJoystickDesc.Buffer axis_mask(@NativeType("Uint32") int value) { SDL_VirtualJoystickDesc.naxis_mask(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code name} field. */
        public SDL_VirtualJoystickDesc.Buffer name(@NativeType("char const *") ByteBuffer value) { SDL_VirtualJoystickDesc.nname(address(), value); return this; }
        /** Sets the address of the specified {@link SDL_VirtualJoystickTouchpadDesc.Buffer} to the {@code touchpads} field. */
        public SDL_VirtualJoystickDesc.Buffer touchpads(@NativeType("SDL_VirtualJoystickTouchpadDesc const *") SDL_VirtualJoystickTouchpadDesc.@Nullable Buffer value) { SDL_VirtualJoystickDesc.ntouchpads(address(), value); return this; }
        /** Sets the address of the specified {@link SDL_VirtualJoystickSensorDesc.Buffer} to the {@code sensors} field. */
        public SDL_VirtualJoystickDesc.Buffer sensors(@NativeType("SDL_VirtualJoystickSensorDesc const *") SDL_VirtualJoystickSensorDesc.@Nullable Buffer value) { SDL_VirtualJoystickDesc.nsensors(address(), value); return this; }
        /** Sets the specified value to the {@code userdata} field. */
        public SDL_VirtualJoystickDesc.Buffer userdata(@NativeType("void *") long value) { SDL_VirtualJoystickDesc.nuserdata(address(), value); return this; }
        /** Sets the specified value to the {@code Update} field. */
        public SDL_VirtualJoystickDesc.Buffer Update(@Nullable @NativeType("void (*) (void *)") SDL_VirtualJoystickDescUpdateCallbackI value) { SDL_VirtualJoystickDesc.nUpdate(address(), value); return this; }
        /** Sets the specified value to the {@code SetPlayerIndex} field. */
        public SDL_VirtualJoystickDesc.Buffer SetPlayerIndex(@Nullable @NativeType("void (*) (void *, int)") SDL_VirtualJoystickDescSetPlayerIndexCallbackI value) { SDL_VirtualJoystickDesc.nSetPlayerIndex(address(), value); return this; }
        /** Sets the specified value to the {@code Rumble} field. */
        public SDL_VirtualJoystickDesc.Buffer Rumble(@Nullable @NativeType("bool (*) (void *, Uint16, Uint16)") SDL_VirtualJoystickDescRumbleCallbackI value) { SDL_VirtualJoystickDesc.nRumble(address(), value); return this; }
        /** Sets the specified value to the {@code RumbleTriggers} field. */
        public SDL_VirtualJoystickDesc.Buffer RumbleTriggers(@Nullable @NativeType("bool (*) (void *, Uint16, Uint16)") SDL_VirtualJoystickDescRumbleTriggersCallbackI value) { SDL_VirtualJoystickDesc.nRumbleTriggers(address(), value); return this; }
        /** Sets the specified value to the {@code SetLED} field. */
        public SDL_VirtualJoystickDesc.Buffer SetLED(@Nullable @NativeType("bool (*) (void *, Uint8, Uint8, Uint8)") SDL_VirtualJoystickDescSetLEDCallbackI value) { SDL_VirtualJoystickDesc.nSetLED(address(), value); return this; }
        /** Sets the specified value to the {@code SendEffect} field. */
        public SDL_VirtualJoystickDesc.Buffer SendEffect(@Nullable @NativeType("bool (*) (void *, void const *, int)") SDL_VirtualJoystickDescSendEffectCallbackI value) { SDL_VirtualJoystickDesc.nSendEffect(address(), value); return this; }
        /** Sets the specified value to the {@code SetSensorsEnabled} field. */
        public SDL_VirtualJoystickDesc.Buffer SetSensorsEnabled(@Nullable @NativeType("bool (*) (void *, bool)") SDL_VirtualJoystickDescSetSensorsEnabledCallbackI value) { SDL_VirtualJoystickDesc.nSetSensorsEnabled(address(), value); return this; }
        /** Sets the specified value to the {@code Cleanup} field. */
        public SDL_VirtualJoystickDesc.Buffer Cleanup(@Nullable @NativeType("void (*) (void *)") SDL_VirtualJoystickDescCleanupCallbackI value) { SDL_VirtualJoystickDesc.nCleanup(address(), value); return this; }

    }

}