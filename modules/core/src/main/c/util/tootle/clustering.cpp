/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include "TootlePCH.h"


#include "soup.h"
#include "mesh.h"
#include "souptomesh.h"
#include "clustering.h"
#include "error.h"

using namespace std;


//=================================================================================================================================
//
//          Clustering implementation
//
//=================================================================================================================================

const float BIGFLOAT = FLT_MAX;

class QNode
{
public:
    float weight;
    int value;
    bool operator<(const QNode& a) const {return weight < a.weight;}
    bool operator>(const QNode& a) const {return weight > a.weight;}
    QNode() {}
    QNode(float w, int v) {weight = w; value = v;}
};



static float EdgeCost(Vector3 cn, Vector3 fn)
{
    float w = cn[0] * cn[0] + cn[1] * cn[1] + cn[2] * cn[2];

    if (w > 0)
    {
        cn /= sqrt(w);
    }

    float c = 1.f - Dot(cn, fn);
    assert(c < BIGFLOAT);
    return .00001f + max(0.f, c);
}

static void AddNeibToQueue(priority_queue<QNode, vector<QNode>, greater<QNode> >& q,
                           Mesh& /*mesh*/, std::vector<int>& fixed, std::vector<float>& cost,
                           std::vector<int>& cluster, std::vector<Vector3>& clusterNormal,
                           int f, int ff, std::vector<Vector3>& tn)
{
    if (fixed[ff])
    {
        return;
    }

    if (cost[f] < cost[ff])
    {
        float c = cost[f];
        assert(c < BIGFLOAT);
        c += EdgeCost(clusterNormal[cluster[f]], tn[ff]);

        if (c < cost[ff])
        {
            fixed[ff] = false;
            cluster[ff] = cluster[f];
            cost[ff] = c;
            assert(c > 0.f);
            q.push(QNode(c, ff));
        }
    }
}

static float FaceDistance(int a, int b, std::vector<Vector3>& tc)
{
    Vector3 d = tc[a] - tc[b];
    return sqrt(Dot(d, d));
}

static int MoveFaces(Mesh& mesh, std::vector<int>& seeds, std::vector<int>& cluster, std::vector<int>& fixed, std::vector<Vector3>& tn, float& fAvgDist)
{
    float fMaxDist = 0.f;
    int distcnt = 0;

    priority_queue<QNode, vector<QNode>, greater<QNode> > q;

    std::vector<int> vis;
    std::vector<float> cost;
    std::vector<int> seed;
    std::vector<Vector3> clusterNormal;

    int nseeds = (int)seeds.size();

    //flood from seeds here
    for (int i = 0; i < static_cast<int>(mesh.t().size()); i++)
    {
        cluster[i] = nseeds;
        fixed[i] = false;

        seed.push_back(0);
        cost.push_back(BIGFLOAT);
        vis.push_back(-1);
    }

    for (int i = 0; i < nseeds; i++)
    {
        int f = seeds[i];
        cluster[f] = i;
        cost[f] = 0.f;
        fixed[f] = true;
        seed[f] = 1;
        clusterNormal.push_back(tn[f]);
    }

    for (int i = 0; i < nseeds; i++)
    {
        int f = seeds[i];

        for (unsigned int j = 0; j < mesh.ae(f).size(); j++)
        {
            int ff = mesh.ae(f)[j];

            if (ff != -1) //not mesh boundary
            {
                AddNeibToQueue(q, mesh, fixed, cost, cluster, clusterNormal, f, ff, tn);
            }
        }
    }

    int nvis = 0;
    int f = -1;
    int count = 0;

    while (!q.empty())
    {

        QNode n = q.top();
        f = n.value;
        q.pop();

        if (fixed[f])
        {
            continue;
        }

        fAvgDist = (fAvgDist * (distcnt) + cost[f]) / (distcnt + 1);
        distcnt++;

        count++;

        assert(seed[f] == 0);

        assert(cluster[f] != nseeds);

        if (vis[f] == -1)
        {
            vis[f] = nvis++;
        }

        fixed[f] = true;
        clusterNormal[cluster[f]] += tn[f];

        for (unsigned int j = 0; j < mesh.ae(f).size(); j++)
        {
            int ff = mesh.ae(f)[j];

            if (ff != -1) //not mesh boundary
            {
                AddNeibToQueue(q, mesh, fixed, cost, cluster, clusterNormal, f, ff, tn);
            }
        }
    }

    if (f == -1)
    {
        // this means that none of the seeds had any neighboring faces.
        // if this happens, then we should find the first face not assigned to a cluster, and return that one
        // this will cause us to add a new seed to that face, effectively jumping across the connectivity gap

        // if the entire input mesh happens to be disconnected, then this should converge to one face per cluster
        UINT i;

        for (i = 0; i < mesh.t().size(); i++)
        {
            if (cluster[i] == nseeds)
            {
                // use this face
                break;
            }
        }

        // we shouldn't get to the end
        assert(i != mesh.t().size());

        return i;
    }

    fMaxDist = cost[f];
    debugf(("Max: %.6f, Avg: %.6f", fMaxDist, fAvgDist));

    int lowvisi = nvis;

    int lowvisf = -1;

    for (int i = 0; i < static_cast<int>(mesh.t().size()); i++)
    {
        if (fixed[i] == false && vis[i] < lowvisi)
        {
            lowvisi = vis[i];
            lowvisf = i;
        }
    }

    if (lowvisf != -1)
    {
        fMaxDist = BIGFLOAT / 2.f;
        return lowvisf;
    }
    else
    {
        return f;
    }

    return 0;
}

static void MoveSeeds(Mesh& mesh, std::vector<int>& seeds, std::vector<int>& cluster, std::vector<int>& fixed, std::vector<Vector3>& tc)
{
    //flood from boundaries here

    int nseeds = (int)seeds.size();
    std::vector<float> cost;
    std::vector<int> visited;

    priority_queue<QNode, vector<QNode>, greater<QNode> > q;

    for (int i = 0; i < static_cast<int>(mesh.t().size()); i++)
    {
        cost.push_back(BIGFLOAT);
        visited.push_back(0);

        for (int j = 0; j < static_cast<int>(mesh.ae(i).size()); j++)
        {
            int ff = mesh.ae(i)[j];

            if (ff != -1 && //not mesh boundary
                (cluster[ff] != cluster[i] || fixed[i] == false || fixed[ff] == false))
            {
                cost[i] = 0;
                q.push(QNode(.0f, i));
                break;
            }
        }
    }

    while (!q.empty())
    {
        QNode n = q.top();
        int f = n.value;
        q.pop();

        if (visited[f] == 1)
        {
            continue;
        }

        visited[f] = 1;

        for (unsigned int j = 0; j < mesh.ae(f).size(); j++)
        {
            int ff = mesh.ae(f)[j];

            if (ff != -1 && //not mesh boundary
                cost[f] < cost[ff])
            {
                float c = cost[f] + FaceDistance(f, ff, tc);

                if (c < cost[ff])
                {
                    cost[ff] = c;
                    q.push(QNode(c, ff));
                }
            }
        }
    }


    // find the face in each cluster with highest edge cost
    // this will be the last face that was reached during the flood

    std::vector<float> seeddist;

    for (int i = 0; i < nseeds; i++)
    {
        seeddist.push_back(cost[seeds[i]]);
    }

    for (int i = 0; i < static_cast<int>(mesh.t().size()); i++)
    {
        if (cost[i] > seeddist[cluster[i]])
        {
            // do not change seeds if the seed we have chosen is the seed of another cluster
            bool bMove = true;

            for (int j = 0; j < nseeds; j++)
            {
                if (i == seeds[j])
                {
                    bMove = false;
                }
            }

            if (bMove)
            {
                seeddist[cluster[i]] = cost[i];
                seeds[cluster[i]] = i;
            }
        }
    }
}

static int FingerPrint(Mesh& mesh, std::vector<int>& cluster)
{
    int ret = 0;

    for (int i = 0; i < static_cast<int>(mesh.t().size()); i++)
    {
        ret = (ret + i * cluster[i]) % 40923840;
    }

    return ret;
}


/// Takes a triangle soup and builds face clusters
/// \param soup  The soup to cluster
/// \param nClusters The number of clusters to create.  If 0, then automatic clustering is used, and nClusters is set
///                  to the number of clusters that are generated
/// \param cluster  An array that will receive the cluster ID to assign to each face
/// \return  One of the ClusterResult return codes
ClusterResult Cluster(Soup* soup, UINT& nClusters, std::vector<int>& cluster)
{

    // compute face normals
    if (!soup->ComputeNormals())
    {
        return CLUSTER_OUT_OF_MEMORY;
    }

    const int nFaces = static_cast<int> (soup->t().size());

    Mesh mesh;

    SoupToMesh(soup, &mesh);


    // compute the set of triangles which use each vertex
    VTArray meshVT;

    if (!mesh.ComputeVT(meshVT))
    {
        return CLUSTER_OUT_OF_MEMORY;
    }

    // compute per-face adjacency
    // allocate the AE array ahead of time so that we can detect out-of-memory conditions
    mesh.ae ().resize (mesh.t ().size ());

    // computeAE should now only fail if the mesh is non-manifold
    if (!mesh.ComputeAE(meshVT))
    {
        return CLUSTER_OUT_OF_MEMORY;
    }

    // compute face normals
    std::vector<Vector3> tn;

    if (!mesh.ComputeTriNormals(tn))
    {
        return CLUSTER_OUT_OF_MEMORY;
    }

    // compute face centers
    std::vector<Vector3> tc;

    if (!mesh.ComputeTriCenters(tc))
    {
        return CLUSTER_OUT_OF_MEMORY;
    }



    cluster.clear();

    for (int i = 0; i < nFaces; i++)
    {
        cluster.push_back(0);
    }

    int nCurClusters = 0;
    float fAvgDist = BIGFLOAT;
    float fAvgDistOld = BIGFLOAT;

    std::vector<int> seeds;
    std::vector<int> fixed;
    std::vector<int> fp;
    fixed.resize(mesh.t().size());

    // if cluster count is fixed, then clamp it
    if ((int)nClusters > mesh.t().size())
    {
        nClusters = (UINT)mesh.t().size();
    }

    srand(982748); //in order to get reproducible results
    int last = rand() % mesh.t().size();

    bool bHasUnassignedFaces = true;

    for (int i = 0;; i++)
    {
        fp.push_back(FingerPrint(mesh, cluster));

        if (bHasUnassignedFaces || nCurClusters < (int)nClusters || nClusters == 0)
        {
            seeds.push_back(last);
            nCurClusters++;
        }
        else
        {
            nClusters = nCurClusters;
            int done = 0;

            for (int j = i - 1; j >= 0; j--)
            {
                if (fp[i] == fp[j])
                {
                    done = 1;
                    break;
                }
            }

            if (done)
            {
                break;
            }
        }

        // if we have nClusters == nFaces, then we need to bail out
        if (nCurClusters == nFaces)
        {
            nClusters = nFaces - 1;
            return CLUSTER_OK;
        }

        if (nCurClusters > 1)
        {
            MoveSeeds(mesh, seeds, cluster, fixed, tc);
        }

        if (fAvgDistOld == BIGFLOAT)
        {
            fAvgDistOld = fAvgDist;
        }
        else
        {
            fAvgDistOld = (fAvgDistOld + fAvgDist) / 2.f;
        }

        last = MoveFaces(mesh, seeds, cluster, fixed, tn, fAvgDist);


        // do not stop adding seeds until EVERY face has been assigned a cluster
        // if the mesh has lots of connected components then we can get a case like this
        bHasUnassignedFaces = false;
        UINT nSeeds = (UINT) seeds.size();

        // @TODO Verify this code - previously, it used a local i
        for (UINT j = 0; j < cluster.size(); j++)
        {
            if (cluster[j] == static_cast<int> (nSeeds))
            {
                bHasUnassignedFaces = true;
                break;
            }
        }


        //heuristic for picking # of clusters, if in automatic mode
        if (nClusters == 0)
        {
            if (!bHasUnassignedFaces)
            {
                if (nCurClusters >= 128 && nFaces / nCurClusters < 250)
                {
                    nClusters = nCurClusters;
                }

                if (nCurClusters >= 16 && fAvgDist > .97f * fAvgDistOld)
                {
                    nClusters = nCurClusters;
                }

                //comparison: debugf(("%f < %f", fAvgDist, .97f * fAvgDistOld));
            }
        }
    }

    debugf(("Final # of clusters: %i", nClusters));
    return CLUSTER_OK;
}



// array of clusters for each face, needed for cluster sorting
static int* g_pCluster;


// comparison function to sort by cluster ID
int __cdecl SortByClusterID(const void* a, const void* b)
{
    int* ia = (int*) a;
    int* ib = (int*) b;

    if (g_pCluster[*ia] < g_pCluster[*ib]) { return -1; }
    else if (g_pCluster[*ia] > g_pCluster[*ib]) { return 1; }
    else { return 0; }
}



/// \param soup   A triangle soup to sort
/// \param clusterIDs  Per-face cluster IDs
/// \param pRemapArray  An array that will receive the face re-mapping.  May NOT be NULL as it is used internally for temporary storage
/// \return True if successful, false if out of memory
bool SortFacesByCluster(Soup& soup, std::vector<int>& clusterIDs, UINT* pRemapArray)
{
    // sort faces by cluster ID
    std::vector<Soup::Triangle> t;
    std::vector<int> c;

    for (int i = 0; i < static_cast<int>(soup.t().size()); i++)
    {
        pRemapArray[i] = i;
    }

    t = soup.t();
    c = clusterIDs;

    g_pCluster = &clusterIDs[0];
    qsort(pRemapArray, soup.t().size(), sizeof(int), SortByClusterID);

    for (int i = 0; i < static_cast<int>(soup.t().size()); i++)
    {
        soup.t(i) = t[pRemapArray[i]];
        clusterIDs[i] = c[pRemapArray[i]];
    }

    return true;
}
