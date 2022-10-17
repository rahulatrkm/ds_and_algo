class Solution {
public int search(int[] arr, int target) {
int pos = -1, start = 0, pivot = -1, end = arr.length - 1, mid = 0;

    if (arr[start] > arr[end]) {
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                pivot = mid - 1;
                break;
            }
            if (mid < (arr.length - 1) && arr[mid] > arr[mid + 1]) {
                pivot = mid;
                break;
            }
            if (arr[mid] > arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        if (pivot == -1) {
            pivot = start;
        }
        start = 0;
        end = pivot;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                // pos = mid;
                break;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (arr[mid] == target) {
            pos = mid;
        }
        if (pos == -1) {
            start = pivot + 1;
            end = arr.length - 1;
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    break;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            if (arr[mid] == target) {
                pos = mid;
            }
        }

    } else {
        pivot = end;
        start = 0;
        end = arr.length - 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                break;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (arr[mid] == target) {
            pos = mid;
        }
    }
    return pos;
}
}
