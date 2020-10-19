class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        int len1 = arr1.length;
        int len2 = arr2.length;
        int min = len2;

        boolean isVersion1Small = false;
        if(len1 < len2) {
            isVersion1Small = true;
            min = len1;
        }
        int i;
        for(i = 0; i < min; i++) {
            int a = Integer.valueOf(arr1[i]);
            int b = Integer.valueOf(arr2[i]);
            if(a < b)
                return -1;
            if(a > b)
                return 1;
        }

        // Version 2 is big
        if(isVersion1Small) {
            int j = i;
            while(j < len2) {
                if(Integer.valueOf(arr2[j++]) > 0)
                    return -1;
            }
        }

        // Version 1 is big
        if(!isVersion1Small) {
            int j = i;
            while(j < len1) {
                if(Integer.valueOf(arr1[j++]) > 0)
                    return 1;
            }

        }

        return 0;
    }
}
