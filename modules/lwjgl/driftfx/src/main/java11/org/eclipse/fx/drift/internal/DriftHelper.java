package org.eclipse.fx.drift.internal;

import org.eclipse.fx.drift.DriftFXSurface;

import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.scene.NodeHelper;
import com.sun.javafx.sg.prism.NGNode;
import com.sun.javafx.util.Utils;

import javafx.scene.Node;

public class DriftHelper extends NodeHelper {
	private static final DriftHelper INSTANCE;
    private static DriftFXSurfaceAccessor driftFXSurfaceAccessor;

    static {
        INSTANCE = new DriftHelper();
        Utils.forceInit(DriftFXSurface.class);
    }

    private static DriftHelper getInstance() {
        System.err.println("Java 11 :: DriftHelper");
        return INSTANCE;
    }

    public static void initHelper(DriftFXSurface driftFXSurface) {
        setHelper(driftFXSurface, getInstance());
    }

	@Override
	protected NGNode createPeerImpl(Node node) {
		return driftFXSurfaceAccessor.doCreatePeer(node);
	}

	@Override
	protected void updatePeerImpl(Node node) {
		super.updatePeerImpl(node);
		driftFXSurfaceAccessor.doUpdatePeer(node);
	}

	@Override
	protected boolean computeContainsImpl(Node node, double localX, double localY) {
		return driftFXSurfaceAccessor.doComputeContains(node, localX, localY);
	}

	@Override
	protected BaseBounds computeGeomBoundsImpl(Node node, BaseBounds bounds, BaseTransform tx) {
		return driftFXSurfaceAccessor.doComputeGeomBounds(node, bounds, tx);
	}

	public static void setDriftFXSurfaceAccessor(final DriftFXSurfaceAccessor newAccessor) {
        if (driftFXSurfaceAccessor != null) {
            throw new IllegalStateException();
        }

        driftFXSurfaceAccessor = newAccessor;
    }

	public interface DriftFXSurfaceAccessor {
        NGNode doCreatePeer(Node node);
        BaseBounds doComputeGeomBounds(Node node, BaseBounds bounds, BaseTransform tx);
        boolean doComputeContains(Node node, double localX, double localY);
        void doUpdatePeer(Node node);
    }
}