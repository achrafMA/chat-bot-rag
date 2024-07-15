import {TextField} from "@vaadin/react-components";
import {useState} from "react";
import {send} from "vite";
import {ChatAIService} from "Frontend/generated/endpoints";

export default function Chat(){
    const [question,setQuestion] = useState<String>("");
    const [response,setResponse] = useState<String>("");

    async function send(){
        ChatAIService.ragChat(question).then(resp=>{
            setResponse(resp);
        });
    }
    return(
      <div className="p-m">
          <h3>Chat Bot</h3>
          <div>
              <TextField style={{width:'80%'}}
                         onChange={(e=>setQuestion(e.target.value))}/>
              <button theme="primary">Send</button>
          </div>
      </div>
    );
}