#include<iostream>
using namespace std;

class Node {
   public:
     int data;
     Node *next;

     Node(int data){
       this->data = data;
       next = NULL;
     }
};

void print(Node *head){
    Node *temp = head;
    while(temp!=NULL){
        cout<<temp->data<<"->";
        temp = temp->next;
    }
    cout<<"NULL"<<endl;
}

Node* deleteithNode(Node* head, int i){
   if(i<0){
      return head;
   }
   if(i==0 && head){
    return head->next;
   }

   Node* curr = head;
   int count = 1;
   while(count<=i-1 && curr!=NULL){
    curr = curr->next;
    count++;
   }
   if(curr && curr->next){
    curr->next = curr->next->next;
    return head;
   }
   return head;
}

Node* takeInput(){
   int data;
   cin>>data;
   Node *head = NULL;  /// LL is empty
   Node *tail = NULL;   /// LL is empty
   while(data != -1){
    /// creating LL
    Node *n = new Node(data);
    /// 1st node
    if(head == NULL){
        head = n;
        tail = n;
    }else {
        tail -> next = n;   /// Inserting at Tail
        tail = n;
    }

    cin>>data;
   }
   return head;

}
int main(){
   cout<<"Enter Data"<<endl;
   Node *head = takeInput();  /// inserting at tail and insert -1 at last
   int i;
   cout<<"Enter Index to delete:"<<endl;
   cin>>i;
   head = deleteithNode(head,i);
   print(head);
   return 0;
}
