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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The MSFT_spatial_anchor_persistence extension. */
public class MSFTSpatialAnchorPersistence {

    /** The extension specification version. */
    public static final int XR_MSFT_spatial_anchor_persistence_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_MSFT_SPATIAL_ANCHOR_PERSISTENCE_EXTENSION_NAME = "XR_MSFT_spatial_anchor_persistence";

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_SPATIAL_ANCHOR_STORE_CONNECTION_MSFT = 1000142000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHOR_PERSISTENCE_INFO_MSFT TYPE_SPATIAL_ANCHOR_PERSISTENCE_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHOR_FROM_PERSISTED_ANCHOR_CREATE_INFO_MSFT TYPE_SPATIAL_ANCHOR_FROM_PERSISTED_ANCHOR_CREATE_INFO_MSFT}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SPATIAL_ANCHOR_PERSISTENCE_INFO_MSFT                  = 1000142000,
        XR_TYPE_SPATIAL_ANCHOR_FROM_PERSISTED_ANCHOR_CREATE_INFO_MSFT = 1000142001;

    /**
     * Extends {@code XrResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT}</li>
     * <li>{@link #XR_ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT}</li>
     * </ul>
     */
    public static final int
        XR_ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT = -1000142001,
        XR_ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT   = -1000142002;

    /** XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT */
    public static final int XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT = 256;

    protected MSFTSpatialAnchorPersistence() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialAnchorStoreConnectionMSFT ] ---

    /** Unsafe version of: {@link #xrCreateSpatialAnchorStoreConnectionMSFT CreateSpatialAnchorStoreConnectionMSFT} */
    public static int nxrCreateSpatialAnchorStoreConnectionMSFT(XrSession session, long spatialAnchorStore) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorStoreConnectionMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), spatialAnchorStore, __functionAddress);
    }

    /**
     * Create a handle to track a connection to the spatial anchor store.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The application <b>can</b> use the {@link #xrCreateSpatialAnchorStoreConnectionMSFT CreateSpatialAnchorStoreConnectionMSFT} function to create an handle to the spatial anchor store. The application <b>can</b> use this handle to interact with the spatial anchor store in order to persist anchors across application sessions.</p>
     * 
     * <p>The {@link #xrCreateSpatialAnchorStoreConnectionMSFT CreateSpatialAnchorStoreConnectionMSFT} function <b>may</b> be a slow operation and therefore <b>should</b> be invoked from a non-timing critical thread.</p>
     * 
     * <pre><code>
     * XrResult xrCreateSpatialAnchorStoreConnectionMSFT(
     *     XrSession                                   session,
     *     XrSpatialAnchorStoreConnectionMSFT*         spatialAnchorStore);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension <b>must</b> be enabled prior to calling {@link #xrCreateSpatialAnchorStoreConnectionMSFT CreateSpatialAnchorStoreConnectionMSFT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code spatialAnchorStore} <b>must</b> be a pointer to an {@code XrSpatialAnchorStoreConnectionMSFT} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param session            the {@code XrSession} the anchor was created with.
     * @param spatialAnchorStore a pointer to the {@code XrSpatialAnchorStoreConnectionMSFT} handle.
     */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorStoreConnectionMSFT(XrSession session, @NativeType("XrSpatialAnchorStoreConnectionMSFT *") PointerBuffer spatialAnchorStore) {
        if (CHECKS) {
            check(spatialAnchorStore, 1);
        }
        return nxrCreateSpatialAnchorStoreConnectionMSFT(session, memAddress(spatialAnchorStore));
    }

    // --- [ xrDestroySpatialAnchorStoreConnectionMSFT ] ---

    /**
     * Destroys the anchor store handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The application <b>can</b> use the {@link #xrDestroySpatialAnchorStoreConnectionMSFT DestroySpatialAnchorStoreConnectionMSFT} function to destroy an anchor store connection.</p>
     * 
     * <pre><code>
     * XrResult xrDestroySpatialAnchorStoreConnectionMSFT(
     *     XrSpatialAnchorStoreConnectionMSFT          spatialAnchorStore);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension <b>must</b> be enabled prior to calling {@link #xrDestroySpatialAnchorStoreConnectionMSFT DestroySpatialAnchorStoreConnectionMSFT}</li>
     * <li>{@code spatialAnchorStore} <b>must</b> be a valid {@code XrSpatialAnchorStoreConnectionMSFT} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code spatialAnchorStore}, and any child handles, <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * </ul></dd>
     * </dl>
     *
     * @param spatialAnchorStore the {@code XrSpatialAnchorStoreConnectionMSFT} to be destroyed.
     */
    @NativeType("XrResult")
    public static int xrDestroySpatialAnchorStoreConnectionMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore) {
        long __functionAddress = spatialAnchorStore.getCapabilities().xrDestroySpatialAnchorStoreConnectionMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(spatialAnchorStore.address(), __functionAddress);
    }

    // --- [ xrPersistSpatialAnchorMSFT ] ---

    /** Unsafe version of: {@link #xrPersistSpatialAnchorMSFT PersistSpatialAnchorMSFT} */
    public static int nxrPersistSpatialAnchorMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore, long spatialAnchorPersistenceInfo) {
        long __functionAddress = spatialAnchorStore.getCapabilities().xrPersistSpatialAnchorMSFT;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorPersistenceInfoMSFT.validate(spatialAnchorPersistenceInfo);
        }
        return callPPI(spatialAnchorStore.address(), spatialAnchorPersistenceInfo, __functionAddress);
    }

    /**
     * Persist the spatial anchor in the spatial anchor store.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The application <b>can</b> use the {@link #xrPersistSpatialAnchorMSFT PersistSpatialAnchorMSFT} function to persist a spatial anchor in the spatial anchor store for this application. The given {@code spatialAnchorName} will be the string to retrieve the spatial anchor from the Spatial Anchor store or subsequently remove the record of this spatial anchor from the store. This name will uniquely identify the spatial anchor for the current application. If there is already a spatial anchor of the same name persisted in the spatial anchor store, the existing spatial anchor will be replaced and {@link #xrPersistSpatialAnchorMSFT PersistSpatialAnchorMSFT} <b>must</b> return {@link XR10#XR_SUCCESS SUCCESS}.</p>
     * 
     * <pre><code>
     * XrResult xrPersistSpatialAnchorMSFT(
     *     XrSpatialAnchorStoreConnectionMSFT          spatialAnchorStore,
     *     const XrSpatialAnchorPersistenceInfoMSFT*   spatialAnchorPersistenceInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension <b>must</b> be enabled prior to calling {@link #xrPersistSpatialAnchorMSFT PersistSpatialAnchorMSFT}</li>
     * <li>{@code spatialAnchorStore} <b>must</b> be a valid {@code XrSpatialAnchorStoreConnectionMSFT} handle</li>
     * <li>{@code spatialAnchorPersistenceInfo} <b>must</b> be a pointer to a valid {@link XrSpatialAnchorPersistenceInfoMSFT} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link #XR_ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorPersistenceInfoMSFT}</p>
     *
     * @param spatialAnchorStore           the {@code XrSpatialAnchorStoreConnectionMSFT} with which to persist the {@code spatialAnchor}.
     * @param spatialAnchorPersistenceInfo a pointer to {@link XrSpatialAnchorPersistenceInfoMSFT} structure to specify the anchor and its name to persist.
     */
    @NativeType("XrResult")
    public static int xrPersistSpatialAnchorMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore, @NativeType("XrSpatialAnchorPersistenceInfoMSFT const *") XrSpatialAnchorPersistenceInfoMSFT spatialAnchorPersistenceInfo) {
        return nxrPersistSpatialAnchorMSFT(spatialAnchorStore, spatialAnchorPersistenceInfo.address());
    }

    // --- [ xrEnumeratePersistedSpatialAnchorNamesMSFT ] ---

    /**
     * Unsafe version of: {@link #xrEnumeratePersistedSpatialAnchorNamesMSFT EnumeratePersistedSpatialAnchorNamesMSFT}
     *
     * @param spatialAnchorNamesCapacityInput the capacity of the {@code spatialAnchorNames} array, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrEnumeratePersistedSpatialAnchorNamesMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore, int spatialAnchorNamesCapacityInput, long spatialAnchorNamesCountOutput, long persistedAnchorNames) {
        long __functionAddress = spatialAnchorStore.getCapabilities().xrEnumeratePersistedSpatialAnchorNamesMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(spatialAnchorStore.address(), spatialAnchorNamesCapacityInput, spatialAnchorNamesCountOutput, persistedAnchorNames, __functionAddress);
    }

    /**
     * Enumerate the names of currently persisted spatial anchors in the spatial anchor store.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The application <b>can</b> use the {@link #xrEnumeratePersistedSpatialAnchorNamesMSFT EnumeratePersistedSpatialAnchorNamesMSFT} function to enumerate the names of all spatial anchors currently persisted in the spatial anchor store for this application. This function follows the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#buffer-size-parameters">two-call idiom</a> for filling the {@code spatialAnchorNames}.</p>
     * 
     * <pre><code>
     * XrResult xrEnumeratePersistedSpatialAnchorNamesMSFT(
     *     XrSpatialAnchorStoreConnectionMSFT          spatialAnchorStore,
     *     uint32_t                                    spatialAnchorNamesCapacityInput,
     *     uint32_t*                                   spatialAnchorNamesCountOutput,
     *     XrSpatialAnchorPersistenceNameMSFT*         persistedAnchorNames);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension <b>must</b> be enabled prior to calling {@link #xrEnumeratePersistedSpatialAnchorNamesMSFT EnumeratePersistedSpatialAnchorNamesMSFT}</li>
     * <li>{@code spatialAnchorStore} <b>must</b> be a valid {@code XrSpatialAnchorStoreConnectionMSFT} handle</li>
     * <li>If {@code spatialAnchorNamesCountOutput} is not {@code NULL}, {@code spatialAnchorNamesCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code spatialAnchorNamesCapacityInput} is not 0, {@code persistedAnchorNames} <b>must</b> be a pointer to an array of {@code spatialAnchorNamesCapacityInput} {@link XrSpatialAnchorPersistenceNameMSFT} structures</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorPersistenceNameMSFT}</p>
     *
     * @param spatialAnchorStore            the {@code XrSpatialAnchorStoreConnectionMSFT} anchor store to perform the enumeration operation on.
     * @param spatialAnchorNamesCountOutput filled in by the runtime with the count of anchor names written or the required capacity in the case that {@code spatialAnchorNamesCapacityInput} is 0.
     * @param persistedAnchorNames          a pointer to an array of {@link XrSpatialAnchorPersistenceNameMSFT} structures, but <b>can</b> be {@code NULL} if propertyCapacityInput is 0.
     */
    @NativeType("XrResult")
    public static int xrEnumeratePersistedSpatialAnchorNamesMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore, @Nullable @NativeType("uint32_t *") IntBuffer spatialAnchorNamesCountOutput, @Nullable @NativeType("XrSpatialAnchorPersistenceNameMSFT *") XrSpatialAnchorPersistenceNameMSFT.Buffer persistedAnchorNames) {
        if (CHECKS) {
            checkSafe(spatialAnchorNamesCountOutput, 1);
        }
        return nxrEnumeratePersistedSpatialAnchorNamesMSFT(spatialAnchorStore, remainingSafe(persistedAnchorNames), memAddressSafe(spatialAnchorNamesCountOutput), memAddressSafe(persistedAnchorNames));
    }

    // --- [ xrCreateSpatialAnchorFromPersistedNameMSFT ] ---

    /** Unsafe version of: {@link #xrCreateSpatialAnchorFromPersistedNameMSFT CreateSpatialAnchorFromPersistedNameMSFT} */
    public static int nxrCreateSpatialAnchorFromPersistedNameMSFT(XrSession session, long spatialAnchorCreateInfo, long spatialAnchor) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorFromPersistedNameMSFT;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.validate(spatialAnchorCreateInfo);
        }
        return callPPPI(session.address(), spatialAnchorCreateInfo, spatialAnchor, __functionAddress);
    }

    /**
     * Create a spatial anchor from the spatial anchor store by name.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The application <b>can</b> use the {@link #xrCreateSpatialAnchorFromPersistedNameMSFT CreateSpatialAnchorFromPersistedNameMSFT} function to create a {@code XrSpatialAnchorMSFT} from the spatial anchor store. If the {@code spatialAnchorName} provided does not correspond to a currently stored anchor (i.e. the list of spatial anchor names returned from {@link #xrEnumeratePersistedSpatialAnchorNamesMSFT EnumeratePersistedSpatialAnchorNamesMSFT}), the function <b>must</b> return {@link #XR_ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT}.</p>
     * 
     * <pre><code>
     * XrResult xrCreateSpatialAnchorFromPersistedNameMSFT(
     *     XrSession                                   session,
     *     const XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT* spatialAnchorCreateInfo,
     *     XrSpatialAnchorMSFT*                        spatialAnchor);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension <b>must</b> be enabled prior to calling {@link #xrCreateSpatialAnchorFromPersistedNameMSFT CreateSpatialAnchorFromPersistedNameMSFT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code spatialAnchorCreateInfo} <b>must</b> be a pointer to a valid {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT} structure</li>
     * <li>{@code spatialAnchor} <b>must</b> be a pointer to an {@code XrSpatialAnchorMSFT} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link #XR_ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT}</li>
     * <li>{@link #XR_ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT}</p>
     *
     * @param session                 a handle to an {@code XrSession} previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param spatialAnchorCreateInfo a pointer to the {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT}.
     * @param spatialAnchor           a pointer to an {@code XrSpatialAnchorMSFT} handle that will be set by the runtime on successful load.
     */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorFromPersistedNameMSFT(XrSession session, @NativeType("XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT const *") XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT spatialAnchorCreateInfo, @NativeType("XrSpatialAnchorMSFT *") PointerBuffer spatialAnchor) {
        if (CHECKS) {
            check(spatialAnchor, 1);
        }
        return nxrCreateSpatialAnchorFromPersistedNameMSFT(session, spatialAnchorCreateInfo.address(), memAddress(spatialAnchor));
    }

    // --- [ xrUnpersistSpatialAnchorMSFT ] ---

    /** Unsafe version of: {@link #xrUnpersistSpatialAnchorMSFT UnpersistSpatialAnchorMSFT} */
    public static int nxrUnpersistSpatialAnchorMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore, long spatialAnchorPersistenceName) {
        long __functionAddress = spatialAnchorStore.getCapabilities().xrUnpersistSpatialAnchorMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(spatialAnchorStore.address(), spatialAnchorPersistenceName, __functionAddress);
    }

    /**
     * Removes an anchor from the store.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The application <b>can</b> use the {@link #xrUnpersistSpatialAnchorMSFT UnpersistSpatialAnchorMSFT} function to remove the record of the anchor in the spatial anchor store. This operation will not affect any {@code XrSpatialAnchorMSFT} handles previously created. If the {@code spatialAnchorName} provided does not correspond to a currently stored anchor, the function <b>must</b> return {@link #XR_ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT}.</p>
     * 
     * <pre><code>
     * XrResult xrUnpersistSpatialAnchorMSFT(
     *     XrSpatialAnchorStoreConnectionMSFT          spatialAnchorStore,
     *     const XrSpatialAnchorPersistenceNameMSFT*   spatialAnchorPersistenceName);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension <b>must</b> be enabled prior to calling {@link #xrUnpersistSpatialAnchorMSFT UnpersistSpatialAnchorMSFT}</li>
     * <li>{@code spatialAnchorStore} <b>must</b> be a valid {@code XrSpatialAnchorStoreConnectionMSFT} handle</li>
     * <li>{@code spatialAnchorPersistenceName} <b>must</b> be a pointer to a valid {@link XrSpatialAnchorPersistenceNameMSFT} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link #XR_ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT}</li>
     * <li>{@link #XR_ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorPersistenceNameMSFT}</p>
     *
     * @param spatialAnchorStore           an {@code XrSpatialAnchorStoreConnectionMSFT} anchor store to perform the unpersist operation on.
     * @param spatialAnchorPersistenceName a pointer to the {@link XrSpatialAnchorPersistenceNameMSFT}.
     */
    @NativeType("XrResult")
    public static int xrUnpersistSpatialAnchorMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore, @NativeType("XrSpatialAnchorPersistenceNameMSFT const *") XrSpatialAnchorPersistenceNameMSFT spatialAnchorPersistenceName) {
        return nxrUnpersistSpatialAnchorMSFT(spatialAnchorStore, spatialAnchorPersistenceName.address());
    }

    // --- [ xrClearSpatialAnchorStoreMSFT ] ---

    /**
     * Clear all spatial anchors from the spatial anchor store.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The application <b>can</b> use the {@link #xrClearSpatialAnchorStoreMSFT ClearSpatialAnchorStoreMSFT} function to remove all spatial anchors from the spatial anchor store for this application. The function only removes the record of the spatial anchors in the store but does not affect any {@code XrSpatialAnchorMSFT} handles previously loaded in the current session.</p>
     * 
     * <pre><code>
     * XrResult xrClearSpatialAnchorStoreMSFT(
     *     XrSpatialAnchorStoreConnectionMSFT          spatialAnchorStore);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension <b>must</b> be enabled prior to calling {@link #xrClearSpatialAnchorStoreMSFT ClearSpatialAnchorStoreMSFT}</li>
     * <li>{@code spatialAnchorStore} <b>must</b> be a valid {@code XrSpatialAnchorStoreConnectionMSFT} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * </ul></dd>
     * </dl>
     *
     * @param spatialAnchorStore {@code XrSpatialAnchorStoreConnectionMSFT} to perform the clear operation on.
     */
    @NativeType("XrResult")
    public static int xrClearSpatialAnchorStoreMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore) {
        long __functionAddress = spatialAnchorStore.getCapabilities().xrClearSpatialAnchorStoreMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(spatialAnchorStore.address(), __functionAddress);
    }

}